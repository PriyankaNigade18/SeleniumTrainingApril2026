package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage 
{
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//Locator
	@FindBy(css="div.inventory_item_name ")
	List<WebElement> allProducts;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addToCartBtn;
	
	//Methods
	
	public int getProductsCount()
	{
		return allProducts.size();
	}
	
	public InventoryPage getProductDetails()
	{
		System.out.println("===Products details===");
		for(WebElement i:allProducts)
		{
			System.out.println(i.getText());
		}
		
		return this;
	}
	
	
	public InventoryPage addProductIntoCart(String pname)
	{
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(pname))
			{
				//click 
				System.out.println(pname+" Found in the list");
				i.click();
				break;
			}
		}
		
		//add it to cart
		addToCartBtn.click();
		System.out.println(pname+" added into Cart");
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	

}
