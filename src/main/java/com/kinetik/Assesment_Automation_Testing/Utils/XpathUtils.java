package com.kinetik.Assesment_Automation_Testing.Utils;

public class XpathUtils {

	public static class AddProducttoCart {

		public static final String ClickOnCart1 = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]";
		public static final String ClickOnCart2 = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a";
		public static final String ClickOnViewCart = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u";
		public static final String ProcceedToCheckOut = "//*[@id=\"do_action\"]/div[1]/div/div/a";
		public static final String RegisterLogin = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u";

	}

	public static class SignUp {

		public static final String Name = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]";
		public static final String Email = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]";
		public static final String SignUpButton = "//*[@id=\"form\"]/div/div/div[3]/div/form/button";

		// ENTER ACCOUNT INFORMATION

		public static final String Title = "//*[@id=\"id_gender2\"]";
		public static final String Password = "//*[@id=\"password\"]";
		public static final String newsletter = "//*[@id=\"newsletter\"]";

		// ADDRESS INFORMATION

		public static final String First_Name = "//*[@id=\"first_name\"]";
		public static final String Last_Name = "//*[@id=\"last_name\"]";
		public static final String Company = "//*[@id=\"company\"]";
		public static final String Address = "//*[@id=\"address1\"]";
		public static final String Address2 = "//*[@id=\"address2\"]";
		public static final String Country = "//*[@id=\"country\"]";
		public static final String State = "//*[@id=\"state\"]";
		public static final String City = "//*[@id=\"city\"]";
		public static final String Zipcode = "//*[@id=\"zipcode\"]";
		public static final String Mobile_Number = "//*[@id=\"mobile_number\"]";

		public static final String Clickon_CreateAccount = "//*[@id=\"form\"]/div/div/div/div[1]/form/button";
		
		
		//Acount Created Continue
		
		public static final String Continue ="//*[@id=\"form\"]/div/div/div/div/a";

	}
}
