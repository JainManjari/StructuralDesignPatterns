package Composite;

import java.util.Iterator;

public class Menu extends MenuComponent {
	
	public Menu(String name,String url)
	{
		this.name=name;
		this.url=url;
	}

	public MenuComponent add(MenuComponent menuComponent)
	{
		menuComponents.add(menuComponent);
		return this;
	}
	
	public MenuComponent remove(MenuComponent menuComponent)
	{
		menuComponents.remove(menuComponent);
		return this;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		sb.append(print(this));
		
		Iterator<MenuComponent> itr=menuComponents.iterator();
		
		while(itr.hasNext())
		{
			MenuComponent menuComponent=itr.next();
			sb.append(menuComponent.toString());
		}
		
		
		return sb.toString();
	}
	
	
	public static void main(String args[])
	{
		Menu mainMenu=new Menu("Main", "/main");
		
		MenuItem safetyMenuItem=new MenuItem("Safety", "/safety");
		
		mainMenu.add(safetyMenuItem);
		
		System.out.println(mainMenu);
		
		Menu subMenu=new Menu("SubMenu","/submenu");
		
		mainMenu.add(subMenu);
		
		System.out.println(mainMenu);
		
		subMenu.add(safetyMenuItem);
		
		System.out.println(subMenu);
		
		System.out.println(mainMenu.toString());
	}
	
}
