#!/usr/bin/env python
# -*- encoding: utf-8 -*-

import sys, os
import subprocess


JAR = "/opt/taobao/java/bin/jar"


class SearchJar:
	"search file in jars"

	def __init__(self, grep, searchList):
		self.grep = grep
		self.searchList = searchList

	def main(self):
		for path in self.searchList:
			if os.path.isfile(path):
				self.grepJar(path)
			elif os.path.isdir(path):
				self.grepDir(path)
			else:
				sys.stderr.write("illegal path: %s\n" % path)

	def grepDir(self, path):
		if not path.endswith(os.path.sep):
			path += os.path.sep
		find = subprocess.Popen(["find", path, "-name", "*.jar"], stdout=subprocess.PIPE)
		for line in find.stdout:
			self.grepJar(line.strip())
		find.wait()

	def grepJar(self, filePath):
		jar = subprocess.Popen([JAR, "tf", filePath], stdout=subprocess.PIPE)
		grep = subprocess.Popen(self.grep, stdin=jar.stdout)
		grep.wait()
		jar.wait()
		if grep.returncode == 0:
			print filePath
			print


def main():
	app = ""
	className, pathList = None, None
	noClass, grep, argList = False, [], []
	# parse arg
	APP, GREP, ARG = "APP", "GREP", "ARG"
	# start from APP
	state = APP
	for e in sys.argv:
		if state == APP:
			app = e
			state = ARG
		elif state == GREP:
			if e == ";":
				state = ARG
			else:
				grep.append(e)
		else:
			# ARG
			if e == "-n":
				noClass = True
			elif e == "--grep":
				state = GREP
			else:
				argList.append(e)

	error = False
	if state != ARG:
		error = True
		print "parse argument error, current state:", state
	if not argList:
		error = True
	if error:
		print "usage:"
		print app, "-n", "<class-name>", "[path...]"
		return

	classFile = None
	if not grep:
		className = argList.pop(0)
		if not noClass:
			classFile = className.replace(".", "/")
		else:
			classFile = className
		grep = ["-F", classFile,]
	grep.insert(0, "grep")
	pathList = argList

	if not classFile is None:
		print "file:", classFile
	else:
		print "grep:", grep
	print "search list:", pathList
	print

	app = SearchJar(grep, pathList)
	app.main()


if __name__ == "__main__":
	main()

