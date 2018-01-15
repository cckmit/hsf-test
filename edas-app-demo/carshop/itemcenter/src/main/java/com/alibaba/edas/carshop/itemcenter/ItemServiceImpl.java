package com.alibaba.edas.carshop.itemcenter;


/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
public class ItemServiceImpl implements ItemService {

	@Override
	public Item getItemById( long id ) {
		Item car = new Item();
		car.setItemId( 1l );
		car.setItemName( "Mercedes Benz111111" );
		System.out.println("Mercedes Benz22222222222"+id );
		return car;
	}
	@Override
	public Item getItemByName( String name ) {
		Item car = new Item();
		car.setItemId( 1l );
		car.setItemName( "Mercedes Benz22222222222" );
		System.out.println("Mercedes Benz22222222222"+name );
		return car;
	}
}
