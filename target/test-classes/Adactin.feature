Feature: Validating the Adactin hotel Application

Scenario Outline: Validate the login functionality with credentials

Given user is an hotel login page

When user should enter valid "<username>" and "<password>"

And user should click login button

And user sholud choose hotel "<location>" ,"<hotel>" ,"<roomtype>" ,"<roomNo>" ,"<checkinDate>" ,"<checkoutDate>" ,"<AdultRoom>" ,"<childRoom>"

And user should click search button

And user should select the hotel and click continue

And user should update profile information "<Firstname>","<Lastname>","<Address>","<CreditCardNo>","<CreditCardType>","<expiryDate>","<expiryMonth>","<cvvnum>"

Then user should be in Booking Conformation page

	Examples:
		|username|password|location|hotel|roomtype|roomNo|checkinDate|checkoutDate|AdultRoom|childRoom|Firtname|Lastname|Address|CreditCardNo|CreditCardType|expiryDate|expiryMonth|cvvnum|
		|jackiechan|vasudev123|London|Hotel Sunshine|Double|1 - One|30//11//2021|01/12/2021|1 - One|1 - One|rajaram|j|chennai|6578965412365478|VISA|May|2022|467|
		|jackiechan|vasudev123|London|Hotel Sunshine|Double|1 - One|30//11//2021|01/12/2021|1 - One|1 - One|sriram|j|chennai|6578965412365478|VISA|May|2022|467|
		|jackiechan|vasudev123|London|Hotel Sunshine|Double|1 - One|30//11//2021|01/12/2021|1 - One|1 - One|suriya|j|chennai|6578965412365478|VISA|May|2022|467|
		|jackiechan|vasudev123|London|Hotel Sunshine|Double|1 - One|30//11//2021|01/12/2021|1 - One|1 - One|greens|j|chennai|6578965412365478|VISA|May|2022|467|
