package com.digit.testProj.p1;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class category
{
	public String categories[]= {
			"1. Electronics",
			"2. Furniture",
			"3. Clothing",
			"4. Groceries",
			"5. Pharmacy"};

}
class subcategory extends category
{		
	public String subcategories[][]= {{"1. Mobile","2. Laptop","3. Tablet","4. Earphones"},
									  {"1. Sofa","2. Dining Table","3. Bed","4. Coffee Table"},
									  {"1. Jackets","2. Pants","3. Shirts","4. Hoodies"},
									  {"1. Fresh Vegetables","2. Fresh Fruits","3. Dairy,Bread and Eggs","4. Rice,Atta and Dals"},
									  {"1. Medicines","2. Diabetes Care","3. Healthcare devices","4. Pain Relief"}};
	void display(int choice)
	{
		for(int i=1;i<=5;i++)
		{
			if(choice==i)
			{
				for(int j=0;j<4;j++)
				{
					System.out.println(subcategories[i-1][j]);
				}
			}
		}
	}
	
	}
class subsubcategory extends subcategory
{
	public int choice1;
	String info[]= {"1. Samsung Galaxy M34 5G","2. OnePlus Nord CE 3 Lite 5G","3. realme narzo N55","4. Apple iPhone 14 ","5. Lava Blaze 5G",
			        "1. Dell Vostro 3420","2. MSI GF63 Thin","3. Xiaomi Notebook Ultra Max","4. ASUS [Smart Choice] Vivobook 15","5. Honor MagicBook 15",
			        "1. Xiaomi Pad 6","2. Samsung Galaxy Tab A8","3. OnePlus Pad","4. Lenovo Tab M10","5. Oppo Pad Air",
			        "1. Jabra Elite 3","2. OnePlus Bullets Z2 ","3. boAt BassHeads 100","4. ZEBRONICS Zeb-Bro","5. PHILIPS Audio TAE1126",
			        "1. Solimo Caroli 6 Seater Sectional Sofa","2. duroflex Utopia 2 Seater Fabric Sofa","3.Amazon Brand - Solimo Hacot 3 Seater Sofa","4. uberlyfe 3 Seater Sofa Cum Bed","5. Casaliving Minta LHS 6 Seater",
			        "1. Nilkamal Peak 4 Seater","2. Solid Sheesham Wood 6 Seater","3. RK DECK INCREDIBLY DECOROUS Wood Solid Sheesham Wood Dining","4. DecorNation Italiana Solid Wood 4 Seater ","5. Waitrose Wooden Solid Sheesham Wood Dining Table Six 6 Seater",
			        "1. KENDALWOOD™ Furniture","2. Wakefit Bed","3. Solimo Medusa","4. Himalaya Sheesham","5. FRESH UP",
			        "1. Solimo Acamar Solid Sheesham Wood Coffee Table","2. Home Centre Helios Bill Coffee Table","3. Home Centre Oakford Glass Top Coffee Table","4. DECOWORLD || Premium Coffee Table","5. WOODWALLZ Square Coffee Tables",
			        "1. AWG ALL WEATHER GEAR","2. E-MAX","3. INKD","4. House & Shields","5. Ben Martin",
			        "1. Generic","2. RynoGear","3. Nettle","4. Blue Tyoga","5. Kotti",
			        "1. HammerSmith","2. Kizyoo","3. Inkast Denim Co","4. Dennis Lingo","5. Van Heusen",
			        "1. More & More","2. More & More","3. KYDA KIDS","4. Alan Jones Clothing","5. Alan Jones Clothing",
			        "1. Onion","2. Potato","3. Coconut","4. Lady's Finger","5. Green Capsicum",
			        "1. Sweet Royal Gaya Apple","2. Dates Fresh Yellow","3. Fruit Salad Box","4. Red Globe Grapes","5. Kiwi Green",
			        "1. GoodLife Toned Milk","2. Taaza Toned Milk","3. Milk plus White Bread","4. Artisanal Organic Curd","5. Farm Fresh Curd",
			        "1. Atta Chakki fresh pouch","2. Nature's super food organic atta","3. Superior MP atta","4. Multigrains Atta","5. 100% Chana Dal Fine Besan",
			        "1. Amoxicillin","2. Doxycycline","3. Acyclovir","4. Valtrex","5. Septrin",
			        "1. Gulcose testing kit","2. Diabetic care","3. A1C Test Strips for Diabetics","4. Lancets for Diabetics","5. insulin bags",
			        "1. Sthethescope","2. Medical Kit","3. Oxygen Sensors","4. SPO2 Probes","5. Ambu Bags",
			        "1. Iodex instant pain relief","2. Ayurvedic Pain Relief  Oil","3. Silicone Gel Heel Pad Socks for Pain Relief","4. Massage gun","5. Electric full body massager"
			        };
	void display(int i)
	{
		for(int j=0;j<=4;j++)
		{
			System.out.println(info[i]);
			i++;
		}
		
	}
}
class description extends subsubcategory{
	int choice2;
	String desc[]= {"Price: Rs.18,999\nOS:	‎Android 13.0\n RAM:	‎6 GB\nProduct Dimensions:	‎0.9 x 7.7 x 16.2 cm; 208 Grams\nBatteries:	‎1 Lithium Ion batteries required. (included)\nItem model number:	‎SM-M346B\nConnectivity technologies:	‎Bluetooth, Wi-Fi, USB\nGPS:	‎True\nSpecial features	‎Fast Charging Support, Dual SIM, Always On Display, Mobile Hotspot Capability, Built-In GPS",
			"Price: Rs.19,999\nOS: ‎OxygenOS \n RAM:	‎8 GB\n Product Dimensions:	‎7.6 x 0.8 x 16.6 cm 195\n Batteries:	‎1 Lithium Polymer batteries required. (included)\n Wireless communication technologies: 	‎Cellular\n Connectivity technologies:	‎Bluetooth, Wi-Fi, USBGPS	‎GLONASS\nSpecial features:	‎Rear Camera, Camera",
			"Price: Rs.10,999\nOS:‎Android 13.0\nRAM:  8 GB\n Product Dimensions:  0.8 x 7.3 x 16 cm; 182 Grams\nBatteries:  ‎1 Lithium Polymer batteries required. (included)\nItem model number:   ‎RMX3750\nWireless communication technologies:  ‎Cellular\nConnectivity technologies:  Bluetooth, Wi-Fi, USB\nGPS:  ‎True\nSpecial features:  90 Hz Super Amoled Display , Vegan Leather Design",
			"Price: Rs.70,999\nDisplay:  6.1-inch Super Retina XDR display\nCamera    Dual :  12MP camera system (Ultra Wide and Wide)\nFront Camera:  12MP\nTrueDepth camera\nFace/Touch ID:    Face ID\nChip:  A15 Bionic chip with 6-core CPU (2 performance and 4 efficiency cores), 5-core GPU, and 16-core Neural Engine\nWater resistant    :  Rated IP68 (maximum depth of 6 meters up to 30 minutes) under IEC standard 60529",
			"Price: Rs.11,999\nOS:  Android 12.0\nRAM:  6 GB\nProduct Dimensions:  ‎16.5 x 7.6 x 0.9 cm; 207 Grams\nBatteries:  ‎1 Lithium Polymer batteries required. (included)\nItem model number:  Lava Blaze 5G Green\nWireless communication technologies:  ‎Cellular\nConnectivity technologies:  ‎Bluetooth, Wi-Fi, USB\nGPS:  ‎True\nSpecial features:  ‎Dual SIM, Expandable Memory, Mobile Hotspot Capability",
			"Price: Rs.35,990\n FHD WVA AG Narrow Border 250 nits Display\ni3-1215U ( 10MB cache, 6 Cores, 4.40 GHz Turbo) Processor\nIntegrated Graphics\n512GB SSD Storage,8GB, 8Gx1, DDR4, 2666MHz Memory",
			"Price: Rs.71,990\nSeries:  ‎GF63 Thin 11SC-853IN\nColour:        Black\nStanding screen display size:    ‎40 Inches\nScreen Resolution:    1920 x 1080 pixel\nResolution:    1920 X 1080 (FHD) Pixels\nProduct Dimensions:    35.9 x 25.4 x 2.2 cm; 1.86 Kilograms\nBatteries:    1 Lithium Polymer batteries required. (included)\nItem model number:    9S7-16R612-853\nRAM Size:    ‎8 GB",
			"Price: Rs.48,999\nBrand: ‎Xiaomi\nModel Name:    ‎Mi Notebook\nModel Year:    ‎2022\nProduct Dimensions:    ‎35 x 24.2 x 1.8 cm; 1.7 Kilograms\nBatteries:    ‎1 Lithium Ion batteries required. (included)\nRAM Size:    ‎16 GB\n",
			"Price: Rs.30,990\nBrand: ASUS\nSeries:    ‎Vivobook 15\nStanding screen display size:    ‎15.6 Inches\nScreen Resolution:    ‎1366 x 768\nPackage Dimensions:    ‎48.6 x 29 x 6.7 cm; 1.8 Kilograms\nBatteries:    ‎1 Lithium Ion batteries required. (included)\nRAM Size:    ‎8 GB\n",
			"Price: Rs.40,990\nBrand: Honor\nSeries:    ‎FRI-F58\nStanding screen display size:    ‎14 Inches\nScreen Resolution:    ‎1200\nProduct Dimensions:    ‎31.2 x 1.7 x 22.2 cm; 1.43 Kilograms\nBatteries:    ‎1 Lithium Polymer batteries required. (included)\nRAM Size:    ‎512 GB\n",
			"Price: Rs.26,999\nBrand: ‎Xiaomi\nModel Name:    ‎Xiaomi Pad 6\nPackage Dimensions:    ‎27.7 x 19 x 5.2 cm; 1.07 Kilograms\nBatteries:    ‎1 Lithium Ion batteries required. (included)\nRam Memory Installed Size:    ‎6 GB\nComputer Memory Type:    ‎DDR4 SDRAM\nOperating System:    ‎Android",
			"Price: Rs.16,999\nBrand: Samsung\nScreen Resolution:    ‎1920 x 1200 pixel\nProduct Dimensions:    ‎0.7 x 24.7 x 16.2 cm; 508 Grams\nBatteries:    ‎1 Lithium Ion batteries required. (included)\nRAM Size:    ‎4 GB\nSpeaker Description:    ‎Dolby Atmos\nRear Webcam Resolution:    ‎8 MP\nFront Webcam Resolution:    ‎5 MP\n",
			"Price: Rs.39,999\nBrand: OnePlus\nModel Name:    ‎OnePlus Pad\nProduct Dimensions:    ‎25.8 x 18.9 x 0.7 cm; 552 Grams\nRAM Size:    ‎12 GB\nMemory Storage Capacity:    ‎256 GB\nRam Memory Installed Size:    ‎12 GB\r\n",
			"Price: Rs.19,999\nBrand:    ‎Lenovo\nModel Name:    ‎Lenovo Tab P11 Plus tablet\nProduct Dimensions:    ‎25.8 x 0.8 x 16.3 cm; 490 Grams\nBatteries:    ‎1 Lithium Polymer batteries required. (included)\nRAM Size:    ‎6 GB\nMemory Storage Capacity:    ‎128 GB\nRam Memory Installed Size:    ‎6 GB\n",
			"Price: Rs.16,999\nBrand:    ‎Honor\nModel Name:    ‎AGM3-W09HN\nPackage Dimensions:    ‎25.5 x 17.8 x 6 cm; 460 Grams\nBatteries:    ‎1 Lithium Polymer batteries required. (included)\nRAM Size:    ‎4 GB\nMemory Storage Capacity:    ‎64 GB\nDigital storage capacity    ‎:    64 GB\n",
			"Price: Rs.4,499\nProduct Dimensions:    ‎2.7 x 2 x 2.01 cm; 120 Grams\nBatteries:    ‎2 Lithium Ion batteries required. (included)\nWireless communication technologies:    ‎Bluetooth\nConnectivity technologies:    ‎Bluetooth\nSpecial features:    ‎Noise Isolation\nOther display features:    ‎Wireless\nColour:    ‎Dark Grey",
			"Price: Rs.1,999\nProduct Dimensions:    ‎37.5 x 11 x 2.5 cm; 27 Grams\nBatteries:    ‎1 Lithium Polymer batteries required. (included)\nColour:    ‎Black\nConnector:    ‎Wireless\nBattery Type:    ‎Lithium Ion\nVoltage:    ‎5 Volts\r\n",
			"Price: Rs.383\nBrand: ‎BoAt\nManufacturer:    ‎Imagine Marketing Ltd, info@imaginemarketingindia.com\nModel:    ‎BassHeads 100\nProduct Dimensions:    ‎120 x 1 x 1 cm; 13 Grams\nCompatible Devices:    ‎All 3.5mm Jack device\n",
			"Price: Rs.149\nBrand:    ‎ZEBRONICS\nModel:    ‎Zeb-Bro\nModel Name:    ‎Zeb-Bro\nProduct Dimensions:    ‎2 x 6.6 x 18.5 cm; 14 Grams\nSpecial Features:    ‎Wireless\n",
			"Price: Rs.1,499\nBrand:    ‎Philips\nProduct Dimensions:    ‎2 x 6.6 x 18.5 cm; 14 Grams\nSpecial Features:    ‎Wireless\nMounting Hardware:    ‎Earphone - 1unit\nNumber of items:    ‎1\nMicrophone format:    ‎In-Line\nHeadphones form factor:    ‎In Ear",
			"Price: Rs.44,249\nBrand:    Amazon Brand - Solimo\nAssembly Required:    Yes\nProduct Dimensions:    0.81D x 2W x 0.73H Meters\nColour:    Navy Blue\nUpholstery Fabric Type:    Polyester\nFrame Material:    Wood\nSize:    3 Seater",
			"Price: Rs.18,876\nBrand:    Duroflex\nAssembly Required:    No\nSeat Depth:    90 Centimeters\nSeat Height:    46 Centimetres\nProduct Dimensions:    90D x 143W x 91H Centimeters\nItem Weight:    35 Kilograms\nColour:    Beige",
			"Price: Rs.37,799\nBrand:    ‎Amazon Brand - Solimo\nAssembly Required:    ‎Yes\nProduct Dimensions:    ‎1.78D x 2.52W x 0.91H Meters\nColour:    ‎Brown\nSize:    ‎6 Seater (RHS) + Ottoman\nMaterial:    ‎Wood\nColor:    ‎Brown",
			"Price: Rs.10,449\nBrand:    Uberlyfe\nSeat Depth:    55.9 Centimeters\nSeat Height:    15 Inches\nProduct Dimensions:    187D x 155W x 21H Centimeters\nType:    Sofa Bed\nColour:    Dark Grey with 2 Cushion (Zigzag Pattern)\nUpholstery Fabric Type:    Cotton",
			"Price: Rs.21,999\nBrand:    Casaliving\nProduct Dimensions:    1.83D x 2.72W x 0.84H Meters\nColour:    Dark Grey\n",
			"Price: Rs.16,999\nProduct Dimensions: Table : Length (120 cm), Width (74 cm), Height (75 cm); Chair : Length (42 cm), Width (52.5 cm), Height (94.2 cm)\nPrimary Material : Solid Wood ; Seating Capacity : 4 Seater\nColor : Cappuccino, Style: Modern, Finish: Polished\nAssembly Required : Assembly would be provided by the Seller\n",
			"Price: Rs.36,500\nColour	Brown Finish-6S\nBrand	Sofani\nRoom Type	Kitchen, Caf, Hall, Dining Room, Restaurants\nSize	6 Seater\nStyle	Modern",
			"Price: Rs.32,300\nColour	Brown Finish-6S\nRoom Type	Kitchen, Caf, Hall, Dining Room, Restaurants\nSize	6 Seater\r\n",
			"Price: Rs.36,500\nColour	Brown Finish-6S\nnRoom Type	Kitchen, Caf, Hall, Dining Room, Restaurants\\nSize	6 Seater\nStyle	Modern",
			"Price: Rs.16,999\nProduct Dimensions: Table : Length (120 cm), Width (74 cm), Height (75 cm); Chair : Length (42 cm), Width (52.5 cm), Height (94.2 cm)\nPrimary Material : Solid Wood ; Seating Capacity : 4 Seater\\nColor : Cappuccino, Style: Modern, Finish: Polished\nAssembly Required : Assembly would be provided by the Seller\n",
			"Price: Rs.18,999\nSize	Queen\nMaterial	Engineered Wood\nProduct Dimensions	198.1L x 152.4W x 91.4H Centimeters\nColour	Grey Finish\nFinish Type	Semi Glossy\nIncluded Components	1 bed, Screw L key\nBrand	KENDALWOOD\nItem Weight	105 Kilograms\r\n",
			"Price: Rs.9,350\nSize	Queen\nMaterial	Engineered Wood\nProduct Dimensions	2.1L x 1.57W x 0.6H Meters\nColour	Brown\nFinish Type	Matte\nCompatible with mattress size	78 X 60 inches\nBrand	Wakefit\r\n",
			"Price: Rs.13,629\nSize	Queen\nMaterial	Rose Wood\nProduct Dimensions	161.5L x 203W x 76H Centimeters\nColour	Walnut\nFinish Type	Laminated\nIncluded Components	Panels,Screw,Assembly Instructions\nCompatible with mattress size	78 X 60 inches\nBrand	Amazon Brand - Solimo\r\n",
			"Price: Rs.18,500\nSize	Queen\nMaterial	Wood\nBrand	Generic\r\n",
			"Price: Rs.14,299\nSize	78x60\nMaterial	Engineered Wood\nProduct Dimensions	187L x 187W x 91H Centimeters\nSpecial Feature	Sturdy\nColour	Grey\nFinish Type	Wood\nIncluded Components	Panel, Frame, Headboard\nBrand	FRESH UP\n",
			"Price: Rs.14,939\nColour	Teak Finish\nBrand	Amazon Brand - Solimo\nSize	Standard\nItem Weight	35000 Grams\nStyle	Contemporary",
			"Price: Rs.2,799\nProduct Dimensions	35.6D x 78.7W x 43.2H Centimeters\nColour	Wenge\nShape	Rectangular\nBrand	Home Centre\nTable design	Coffee Table\nSpecial Feature	Storage\nTop Material Type	Engineered Wood\nFinish Type	Laminated",
			"Price: Rs.4,999\nProduct Dimensions	50D x 14W x 43H Centimeters\nColour	Walnut\nShape	Rectangular\nBrand	Home Centre\nTable design	Coffee Table\nSpecial Feature	Storage\nTop Material Type	Engineered Wood",
			"Price: Rs.3,148\nProduct Dimensions	59D x 59W x 49.5H Centimeters\nColour	Black Finish\nShape	Rectangular\nBrand	DECOWORLD\nTable design	Coffee Table\nStyle	Modern\r\n",
			"Price: Rs.3,688\nProduct Dimensions	50D x 50W x 45H Centimeters\nColour	Gold & White\nShape	Square\nBrand	WOODWALLZ\nSpecial Feature	Storage, Space Saving\nTop Material Type	Metal\nFinish Type	Powder Coated\nBase Type	Legs",
			"Price: Rs.2,999\nG. P. ENTERPRISES Men Full Sleeve Jacket",
			"Price: Rs.819\nMen's Lightweight Casual Jacket for Layering",
			"Price: Rs.619\nTrending Varsity Jacket for Men. Bomber Style Jacket",
			"Price: Rs.849\nWinter Wear Casual Zipper Half Sleeve Men's Jacket",
			"Price: Rs.969\nMen's Stretch Denim Jacket",
			"Price: Rs.499\nMen's Lycra Track Pants for Comfortable and Stylish Active Wear",
			"Price: Rs.599\nMen's Lycra Stretchable Regular fit Track Pants with Zipper Pocket",
			"Price: Rs.550\nMen Regular Fit Track Pants (Pack of 2)",
			"Price: Rs.330\nBoy's Regular Fit Track Pant",
			"Price: Rs.650\n Women Polyester Blend Green Solid Trousers",
			"Price: Rs.999\n Men Casual Shirt",
			"Price: Rs.450\n Men Casual Shirt",
			"Price: Rs.850\n Men Casual Shirt",
			"Price: Rs.888\n Men Casual Shirt",
			"Price: Rs.450\n Men Casual Shirt",
			"Price: Rs.1,999\n Men's Cotton Hooded Neck Hoodies",
			"Price: Rs.3,222\n Unisex-Adult Cotton Hooded Neck Avenger Printed Hoodie",
			"Price: Rs.2,500\n Men's Fleece Hooded Hoodie",
			"Price: Rs.1,299\n Men's Fleece Hooded Hoodie",
			"Price: Rs.999\n Men's Fleece Hooded Hoodie",
			"Price: Rs.43\nOnion has antioxidants and nutrients. They can be baked,boiled,fried,sauted and powdered.",
			"Price: Rs.35\nPotatoes contain carbohydrates,flaonoids and carotenoids. It can be fried,made into salary,added to salads.",
			"Price: Rs.25\nApprox:350g to 500g",
			"Price: Rs.31\n250gx2",
			"Price: Rs.86\nApprox: 500g to 700g",
			"Price: Rs.111\nRoyal Gaya apples are crispy,sweet and aromatic. it contains fibres,vitamin C and anti-oxidants. Apples can be added to salads,smoothies,pies and milkshakes",
			"Price: Rs.69",
			"Price: Rs.73\nFruit Salad Box-Muskemelon,papaya,Grapes and Pineapple",
			"Price: Rs.69\nRed Globe Grapes have large and round globes with crunchy skin and fleshy pulp. They have mild sweetness and flavour.They can be added to salads and juices.",
			"Price: Rs.145\nKiwisn contain Vitamin C,dietary fibres and anti-oxidants. Kiwis can be added to salads,smoothies and pies",
			"Price: Rs.64\nRich source of proteins with a high proportion of essential amino acids.",
			"Price: Rs.72\nRich source of proteins with a high proportion of essential amino acids.",
			"Price: Rs.50\n",
			"Price: Rs.150\n",
			"price: Rs.68\n",
			"Price: Rs.277\nPillsbury Chakki Fresh- Atta 5KG",
			"Price: Rs.68\n",
			"Price: Rs.470\nAashirvad Superior MP Atta is 100% pure whole atta made in India.",
			"Price: Rs.327\nAashirvad Atta with Multigrains provide you and your family with the health benefits without comprimising on the taste.",
			"Price: Rs.121\nTata Sampann Fine Besan is all you need in the kitchen to enjoy all-natural,authentic taste of 100% unpoloshed chana dal in all your favourite recipes.",
			"Price: Rs.32\nAmoxicillin is an antibiotic related to penicillin and is used to treat a variety of bacterial infections. Most people will have taken amoxicillin or penicillin at least once in their life since it is used for everything from urinary tract to ear infections",
			"Price: Rs.55\nDoxycycline is an antibiotic medicine used to treat bacterial infections in your body. It is effective in some infections of the lungs, urinary tract, eyes, and others. It kills bacteria, which helps to improve your symptoms and cure the infection. It may also be used for the treatment of severe acne.",
			"Price: Rs.26\nAcyclovir is an antiviral medicine which treats eye infections caused by Herpes simplex virus. It works by preventing the multiplication of the virus on the surface of your eyeball (cornea). This stops the production of new viruses and clears up your eye infection.",
			"Price: Rs.35\nValtrex is an antiviral drug. It slows the growth and spread of the herpes virus to help the body fight the infection. Valtrex is used to treat infections caused by herpes viruses, including genital herpes, cold sores, and shingles(herpes zoster) in adults.",
			"Price: Rs.38\nSeptrin is a brand name for the antibiotic medicine co-trimoxazole. This antibiotic is mainly used to prevent a small number of serious infections in people with an underactive immune system, for example people with HIV or AIDS and people having treatment for cancer.",
			"Price: Rs.700\nProduct Dimensions ‏ : ‎ 18 x 10 x 10 cm; 300 Grams\nDate First Available ‏ : ‎ 16 January 2021\nManufacturer ‏ : ‎ Kaynes Technology India Pvt. Ltd.\nASIN ‏ : ‎ B08T7JXDW9\nItem model number ‏ : ‎ BeatoGlucometerstrips25",
			"Price: Rs.650\nProduct Dimensions ‏ : ‎ 15 x 20 x 13 cm; 250 Grams\nASIN ‏ : ‎ B09BFZ6HC4\nItem model number ‏ : ‎ PN_DCPP_400GMVF\nCountry of Origin ‏ : ‎ India\nManufacturer ‏ : ‎ Patanjali Ayurved Ltd, NUTRELA\nPacker ‏ : ‎ PATANJALI AYURVEDA",
			"Price: Rs.800\nProduct Dimensions ‏ : ‎ 6 x 4 x 6 cm; 150 Grams\nDate First Available ‏ : ‎ 26 June 2020\nManufacturer ‏ : ‎ Medsource Ozone Biomedicals Private Limited\nASIN ‏ : ‎ B08BWJX79B\nItem model number ‏ : ‎ OZET050",
			"Price: Rs.850\nProduct Dimensions ‏ : ‎ 7.1 x 4.6 x 8.9 cm; 50 Grams\nDate first Available ‏ : ‎ 4 June 2021\nManufacturer ‏ : ‎ K-Life\nASIN ‏ : ‎ B096MS347L\nCountry of Origin ‏ : ‎ China",
			"Price: Rs.900\nProduct Dimensions ‏ : ‎ 13 x 10 x 23 cm; 680 Grams\nDate First Available ‏ : ‎ 1 August 2016\nManufacturer ‏ : ‎ Authentic Drugs & Cosmetics LLP\nASIN ‏ : ‎ B01JGRIMWU\nCountry of Origin ‏ : ‎ India",
			"Price: Rs.4,883\nColour:    ‎Black\nBrand:    ‎3M Littmann\nItem Dimensions LxWxH:    ‎24.8 x 13 x 4.4 Centimeters\nMaterial:    ‎Stainless Steel\nIs Electric:    ‎No\r\n",
			"Price: Rs.599\nBrand:    ‎EMNDR\nColour:    ‎White\nMaterial:    ‎Plastic\nSpecial Feature:    ‎Portable, Removable\nStyle:    ‎Multipurpose, Portable, Unique\nRoom Type:    ‎Kitchen, office\n",
			"Price: Rs.2,583\nPackage Dimensions ‏ : ‎ 18 x 16 x 5 cm; 100 Grams\nManufacturer ‏ : ‎ Biometric Cables\nASIN ‏ : ‎ B07HP5YJ8K\nItem Weight ‏ : ‎ 100 g",
			"Price: Rs.1,229\nSpO2 Range: 70% - 100%\nSpO2 Resolution: ±1%\nAccuracy: ±2%\nPulse Rate Range: 30-240bpm\nPulse Rate Resolution: ±1bpm\r\n",
			"Price: Rs.1,779\nPackage Dimensions ‏ : ‎ 26.49 x 16.79 x 5.41 cm; 308.44 Grams\nDate First Available ‏ : ‎ 4 October 2017\nManufacturer ‏ : ‎ primestore\nASIN ‏ : ‎ B0763SQB6C\nItem part number ‏ : ‎ PrimeStore1006\nItem Weight ‏ : ‎ 308 g\r\n",
			"Price: Rs.60\nManufacturer:    ‎Pontika Aerotech Ltd.\nItem model number:    ‎YGISC00\nProduct Dimensions:    ‎3.5 x 3.5 x 17.5 cm; 60 Grams\nASIN:    ‎B09316BMX9",
			"Price: Rs.265\nManufacturer:    ‎Dr Ortho\nCountry of Origin:    ‎India\nItem model number:    ‎DSDRO120MLX1PC\nProduct Dimensions:    ‎6 x 4 x 13 cm; 120 Kilograms\nASIN:    ‎B01GPMV4RO",
			"Price: Rs.199\nThe all in one foot care solution for cracked, dry, hard and painful heels. Can be worn at any time of the day and can be used with all types of footwear. Absorbs pounding shocks, reduces friction and pressure on the heels. Can be washed and reused. Can be used by both men and women.",
			"Price: Rs.1,999\nProduct Dimensions ‏ : ‎ 27 x 21.3 x 6.8 cm; 700 Grams\nManufacturer ‏ : ‎ beatXP\nASIN ‏ : ‎ B0BBB3F6FW\nItem model number ‏ : ‎ BXMGN1101BK\nItem Weight ‏ : ‎ 700 g\r\n",
			"Price: Rs.1,999\nProduct Dimensions ‏ : ‎ 20 x 13 x 24 cm; 1 Kilograms\nManufacturer ‏ : ‎ Nureca Limited\nASIN ‏ : ‎ B076ZRH5WQ\nItem model number ‏ : ‎ NECWZ_IGH00064\nNet Quantity ‏ : ‎ 1 count\nIncluded Components ‏ : ‎ Massager\r\n"
	};

	void display1(int formula)
	{	
		System.out.println(desc[formula]);
		String str;
		System.out.println("Do you want to purchase this item? ");
		System.out.println("  ");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		if(str.contentEquals("yes"))
		{
			System.out.println("Yay! You have purchased this item.");
			System.out.println("  ");
		}
	}
}
class Invoice{
	private static int invoiceNumber=1000;
	
	public static void printInvoice(String itemName) {
		System.out.println("   ");
		System.out.println("~~~~~~~~~~~~~~~~~~INVOICE~~~~~~~~~~~~~~~~~~");
		System.out.println(" ");
		System.out.println("InvoiceNumber:" +invoiceNumber);
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("  ");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("  ");
        System.out.println("Date: " + dateTime.format(dateFormatter));
        System.out.println("  ");
        System.out.println("Time: " + dateTime.format(timeFormatter));
        System.out.println("  ");
		System.out.println("Item:" +itemName);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		invoiceNumber++;
	}
}
	public class Ecommerce {
		public static void main(String[] args) {
			System.out.println("~~~~~~~~~~~~~~~Welcome to Shopotonetoics~~~~~~~~~~~~~~~~");
			System.out.println("  ");
			category c=new category();
			for(int i=0;i<5;i++)
			{
				System.out.println(c.categories[i]);
			}
			int choice;
			System.out.println("   ");
			System.out.println("Enter your choice: ");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			subcategory s=new subcategory();
			s.display(choice);
			int choice1;
			System.out.println("Enter your choice: ");
			choice1=sc.nextInt();
			subsubcategory s1=new subsubcategory();
			int f;
			f=(choice-1)*20+(choice1-1)*5;
			s1.display(f);
			System.out.println("Enter your choice: ");
			int choice2;
			choice2=sc.nextInt();
			description d=new description();
			String str;
			int formula;
			formula=(choice-1)*20+(choice1-1)*5+choice2-1;
			d.display1(formula);
			Invoice.printInvoice(d.info[formula]);
			System.out.println("Thanks you for shopping with us!!!...");
			System.out.println("   ");
			System.out.println("Type Exit to leave the Application.");
			System.out.println("  ");
			System.out.println("Type Menu to roll back to the menu page");
			str=sc.next();
			if(str.contentEquals("Exit"))
			{
				System.exit(0);
			}
			else if(str.contentEquals("Menu"))
			{
				Ecommerce cr=new Ecommerce();
				cr.main(args);
			}
		}
	}
