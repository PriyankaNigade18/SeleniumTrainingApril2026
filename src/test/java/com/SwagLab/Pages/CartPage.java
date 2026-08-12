package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	private WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(css="a.shopping_cart_link")
	WebElement cartOption;
	
	@FindBy(css="div.inventory_item_name")
	WebElement cartProduct;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	WebElement continueShoppingBtn;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn;
	
	
	public CartPage launchCartPage()
	{
		cartOption.click();
		return this;
		
	}
	
	public String getCartProductDetails()
	{
		return cartProduct.getText();
		
	}
	
	public CartPage doRemoveProduct()
	{
		removeBtn.click();
		return this;
	}
	
	public InventoryPage doContinueShopping()
	{
		continueShoppingBtn.click();
		//navigation to inventory page
		return new InventoryPage(driver);
	}
	
	
	public void launchCheckoutPage()
	{
		checkoutBtn.click();
		//return 
	}
	
	
}
