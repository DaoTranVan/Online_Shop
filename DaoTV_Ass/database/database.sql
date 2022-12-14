USE [All_System]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 3/24/2022 9:57:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[UserID] [nvarchar](10) NOT NULL,
	[Name] [nvarchar](20) NULL,
	[Password] [nvarchar](20) NULL,
	[Address] [nvarchar](50) NULL,
	[City] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[Admin] [int] NULL,
 CONSTRAINT [PK_Accounts] PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 3/24/2022 9:57:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[CategoryID] [nvarchar](10) NOT NULL,
	[CategoryName] [nvarchar](20) NULL,
	[Describe] [nvarchar](50) NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[InfoLab]    Script Date: 3/24/2022 9:57:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InfoLab](
	[ProductID] [nvarchar](10) NOT NULL,
	[CPU] [nvarchar](200) NULL,
	[GPU] [nvarchar](200) NULL,
	[Manhinh] [nvarchar](200) NULL,
	[Hedieuhanh] [nvarchar](200) NULL,
	[RAM] [nvarchar](200) NULL,
	[SSD] [nvarchar](200) NULL,
	[HDD] [nvarchar](200) NULL,
	[Lan] [nvarchar](200) NULL,
	[WLan] [nvarchar](200) NULL,
	[Congketnoi] [nvarchar](200) NULL,
	[Banphim] [nvarchar](200) NULL,
	[Pin] [nvarchar](200) NULL,
	[Kichthuoc] [nvarchar](200) NULL,
	[Trongluong] [nvarchar](200) NULL,
 CONSTRAINT [PK_InfoLab] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[InfoPC]    Script Date: 3/24/2022 9:57:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InfoPC](
	[ProductID] [nvarchar](10) NOT NULL,
	[CPU] [nvarchar](200) NULL,
	[Main] [nvarchar](200) NULL,
	[RAM] [nvarchar](200) NULL,
	[VGA] [nvarchar](200) NULL,
	[SSD] [nvarchar](200) NULL,
	[Nguon] [nvarchar](200) NULL,
	[VoCase] [nvarchar](200) NULL,
 CONSTRAINT [PK_InfoPC] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetails]    Script Date: 3/24/2022 9:57:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetails](
	[OrderID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Price] [int] NULL,
	[Quantity] [int] NULL,
 CONSTRAINT [PK_OrderDetails] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 3/24/2022 9:57:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [nvarchar](10) NOT NULL,
	[OrderDate] [date] NULL,
	[TotalPrice] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 3/24/2022 9:57:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[ProductID] [nvarchar](10) NOT NULL,
	[ProductName] [nvarchar](50) NOT NULL,
	[CategoryID] [nvarchar](10) NOT NULL,
	[Img] [nvarchar](20) NULL,
	[Price] [int] NULL,
	[Amount] [int] NULL,
 CONSTRAINT [PK_Products] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'', N'', N'', N'', N'', N'', 0)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'1', N'Dao', N'123', N'hong thuan - giao thuy', N'Nam Dinh', N'037122321', NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'11', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'2', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'3', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'4', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'5', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'6', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'7', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'8', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'9', NULL, N'123', NULL, NULL, NULL, NULL)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'Chieu', N'Chieu', N'123', N'Hai Phong city', N'Hai Phong', N'0900000009', 0)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'Dao', N'Dao', N'123', N'hong thuan - giao thuy', N'Nam Dinh', N'037122321', 1)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'Dat', N'Dat', N'123', N'Quat Lam', N'Nam Dinh', N'0900000009', 0)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'Nam', N'Nam', N'123', N'Mi Duc', N'Ha Noi', N'0900000009', 0)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'Thanh', N'Thanh', N'123', N'Hai Phong city', N'Hai Phong', N'0900000009', 0)
INSERT [dbo].[Accounts] ([UserID], [Name], [Password], [Address], [City], [Phone], [Admin]) VALUES (N'Toan', N'Toan', N'123', N'Bac Linh', N'Bac Ninh', N'0900000009', 0)
GO
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Describe]) VALUES (N'1', N'PC', NULL)
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Describe]) VALUES (N'2', N'Laptop', NULL)
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Describe]) VALUES (N'3', N'Linh kiện', NULL)
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Describe]) VALUES (N'4', N'Gaming Gear', NULL)
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Describe]) VALUES (N'5', N'Phụ kiện', NULL)
GO
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'12', N'AMD Ryzen 7 – 5800H', N'Radeon RX6600m 8GB', N'17.3" FHD (1920×1080) IPS 144Hz', N'Windows 11 SL 64 Bit', N'DDR4 8GB (1 x 8GB) 3200MHz; 2 slots, up to 32GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'1 slot HDD 2.5"', N'Killer Gb LAN', N'AMD Wi-Fi 6E RZ608 + Bluetooth', N'2x USB 3.2 Gen1,1x USB 2.0, 1x USB 3.2 Gen1 Type C w/DP, HDMI (supports 4K @ 60Hz), 1 Audio Combo, 1 x Webcam, 1 x Power Delivery', N'RGB Gaming Keyboard', N'4 cell, 90Whr', N'398 x 273 x 24.2 mm', N'2.55 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'13', N'AMD Ryzen 7 5800H', N'Radeon RX5500M 4GB', N'15.6" FullHD (1920 x 1080), 144Hz, IPS Panel', N'Windows 11 Home 64 bit', N'DDR4 8GB (1 x 8GB) 3200MHz; 2 slots, up to 32GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'Null', N'Gigabit Lan', N'AMD Wi-Fi 6E RZ608', N'1x (4K @ 30Hz) HDMI, 1x RJ45, 1x Type-C USB3.2 Gen1, 3x Type-A USB3.2 Gen1', N'Backlight Keyboard ( Red )', N'3 Cell', N'359 x 254 x 21.7 mm', N'1.9 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'14', N'AMD Ryzen 7 5800H', N'Radeon RX5500M 4GB', N'15.6" FullHD (1920 x 1080), 60Hz, IPS Panel', N'Windows 11 Home 64 bit', N'DDR4 8GB (1 x 8GB) 3200MHz; 2 slots, up to 32GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'Null', N'Gigabit Lan', N'AMD Wi-Fi 6E RZ608', N'1x (4K @ 30Hz) HDMI, 1x RJ45, 1x Type-C USB3.2 Gen1, 3x Type-A USB3.2 Gen1', N'Backlight Keyboard ( Red )', N'3 Cell', N'359 x 254 x 21.7 mm', N'2.35 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'15', N'AMD Ryzen 5 5600H', N'Radeon RX5500M 4GB', N'15.6" FullHD (1920 x 1080), 60Hz, IPS Panel', N'Windows 11 Home 64 bit', N'DDR4 8GB (1 x 8GB) 3200MHz; 2 slots, up to 32GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'Null', N'Gigabit Lan', N'AMD Wi-Fi 6E RZ608', N'1x (4K @ 30Hz) HDMI, 1x RJ45, 1x Type-C USB3.2 Gen1, 3x Type-A USB3.2 Gen1', N'Backlight Keyboard ( Red )', N'3 Cell', N'359 x 254 x 21.7 mm', N'2.35 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'16', N'Intel Core i7 11800H', N'Geforce RTX 3060 6GB', N'17.3" FHD (1920×1080) IPS, 144Hz', N'Windows 11 SL 64 Bit', N'DDR4 16GB (2 x 8GB) 3200MHz; 2 slots, up to 64GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'1 slot HDD 2.5"', N'Gigabit Ethernet', N'Intel Wi-Fi 6 AX201(2*2 ax) + BT5', N'1x (4K @ 60Hz) HDMI, 1x RJ45, 1x Type-A USB2.0, 1x Type-C USB3.2 Gen1, 2x Type-A USB3.2 Gen1', N'Backlight Keyboard ( Red )', N'3 Cells,, 53.5Whr', N'398 x 273 x 25.2 mm', N'2.3 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'17', N'Intel Core i7 11800H', N'Geforce RTX 3060 6GB', N'15.6" FullHD (1920 x 1080). 144Hz, IPS Panel, 100% sRGB', N'Windows 11 SL 64 Bit', N'DDR4 16GB (2 x 8GB) 3200MHz; 2 slots, up to 64GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'1 slot HDD 2.5"', N'Gigabit Ethernet', N'Intel Wi-Fi 6 AX201(2*2 ax) + BT5', N'1x (4K @ 60Hz) HDMI, 1x RJ45, 1x Type-A USB2.0, 1x Type-C USB3.2 Gen1, 2x Type-A USB3.2 Gen1', N'Backlight Keyboard ( Red )', N'3 Cells, 53.5Whr', N'359 x 259 x 24.9 mm', N'2.1 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'18', N'Intel Core i7 11800H', N'Geforce RTX 3050Ti 4GB', N'17.3" FHD (1920×1080) IPS, 144Hz', N'Windows 10 SL 64 Bit', N'DDR4 8GB (1 x 8GB) 3200MHz; 2 slots, up to 64GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'1 slot HDD 2.5"', N'Gigabit Ethernet', N'Intel Wi-Fi 6 AX201(2*2 ax) + BT5', N'1x (4K @ 60Hz) HDMI, 1x RJ45, 1x Type-A USB2.0, 1x Type-C USB3.2 Gen1, 2x Type-A USB3.2 Gen1', N'Backlight Keyboard ( Red )', N'3 Cells, 53.5Whr', N'398 x 273 x 25.2 mm', N'2.3 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'19', N'Intel Core i7 11800H', N'Geforce RTX 3050Ti 4GB', N'15.6" FullHD (1920 x 1080). 144Hz, IPS Panel, 100% sRGB', N'Windows 10 SL 64 Bit', N'DDR4 8GB (1 x 8GB) 3200MHz; 2 slots, up to 64GB', N'512GB SSD NVMe M.2 PCIe Gen 3 x 4', N'1 slot HDD 2.5"', N'Gigabit Ethernet', N'Intel Wi-Fi 6 AX201(2*2 ax) + BT5', N'1x (4K @ 60Hz) HDMI, 1x RJ45, 1x Type-A USB2.0, 1x Type-C USB3.2 Gen1, 2x Type-A USB3.2 Gen1', N'Backlight Keyboard ( Red )', N'3 Cells, 53.5Whr', N'359 x 259 x 24.9 mm', N'2.1 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'20', N'Intel Core i9 12900HK', N'Geforce RTX 3080Ti 16GB', N'17.3" UHD (3840*2160), 120Hz 100% Adobe', N'Windows 11 SL 64 Bit', N'DDR4 64GB (2 x 32GB) Bus 3200MHz', N'2TB SSD NVMe M.2 PCIe Gen 4×4', N'Null', N'Killer Gb LAN', N'Killer Wi-Fi 6 AX1650i (2*2 ax) + BT5', N'Null', N'SteelSeries Backlight Keyboard (Per-Key RGB, Full-Color)', N'4 Cells, 99.9Whrs', N'397 x 268.5 x 27.5 mm', N'2.9 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'21', N'Intel Core i7 11800H', N'Geforce RTX 3080 16GB', N'15.6" QHD IPS, 240Hz', N'Windows 10 SL 64 Bit', N'DDR4 32GB (2 x 16GB) bus 3200MHz', N'2TB SSD NVMe M.2 PCIe Gen 4×4', N'Null', N'Killer Gb LAN', N'Killer Wi-Fi 6 AX1650i (2*2 ax) + BT5', N'Null', N'SteelSeries Backlight Keyboard (Per-Key RGB, Full-Color)', N'4 Cells, 99.9Whrs', N'397 x 268.5 x 27.5 mm', N'2.65 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'22', N'Intel Core i9 12900H', N'Geforce RTX 3080 8GB MaxQ', N'17.3" QHD (2560*1440), 240Hz DCI-P3 100% typical', N'Windows 11 SL 64 Bit', N'DDR5 32GB (2 x 16GB) 4800MHz; 2 slots up to 64GB', N'2TB SSD NVMe M.2 PCIe Gen 4×4', N'Null', N'Killer Gb LAN', N'Intel® Killer™ Wi-Fi 6E AX1675 + BT5', N'Null', N'SteelSeries Backlight Keyboard (Per-Key RGB, Full-Color)', N'4 Cells, 99.9Whrs', N'396.1 x 259.4 x 20.25 mm', N'2.45 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'23', N'Intel Core i7 12700H', N'Geforce RTX 3070Ti 8GB', N'15.6" QHD (2560*1440), 240Hz DCI-P3 100% typical', N'Windows 11 SL 64 Bit', N'DDR5 32GB (2 x 16GB) 4800MHz; 2 slots up to 64GB', N'1TB SSD NVMe M.2 PCIe Gen 4×4', N'Null', N'Killer Gb LAN', N'Intel® Killer™ Wi-Fi 6E AX1675 + BT5', N'Null', N'SteelSeries Backlight Keyboard (Per-Key RGB, Full-Color)', N'4 Cells, 99.9Whrs', N'358.3 x 248 x 18.3-19.8 mm', N'2.1 kg')
INSERT [dbo].[InfoLab] ([ProductID], [CPU], [GPU], [Manhinh], [Hedieuhanh], [RAM], [SSD], [HDD], [Lan], [WLan], [Congketnoi], [Banphim], [Pin], [Kichthuoc], [Trongluong]) VALUES (N'26', N'Intel Core i7 11800H', N'Geforce RTX 3070Ti 8GB', N'15.6" FHD (1920 x 1080) IPS, 360Hz', N'Windows 10 SL 64 Bit', N'DDR4 32GB (2 x 16GB) 3200MHz; 2 slots up to 64GB', N'2TB SSD NVMe M.2 PCIe Gen 4×4', N'Null', N'Killer Gb LAN', N'Intel Wi-Fi 6 AX201(2*2 ax) + BT5', N'Null', N'SteelSeries Backlight Keyboard (Per-Key RGB, Full-Color)', N'4 Cells, 99.9Whrs', N'357.7 x 247.7 x 17.9 mm', N'1.9 kg')
GO
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'1', N'Intel Core i5-11400F - Chính hãng Intel VN', N'GIGABYTE B560M AORUS ELITE', N'Ram Team T -Force Vulcanz 16GB (2X BGB) 3200 MHz DDR4 - Tân nhiệt Xám', N'Gigabyte RTX 3050 8GB Eagle OC', N'SSD Lexar NM620 256GB M.2 NVMe PCle Gen3 x4 (Read 3000 MB/s, Write 2400 MB/s)', N'Deepcool DN550 550W - 80Plus White', N'Xigmatek Gaming X 3FX - 1 mặt kính ATX (3 FAN RGB)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'10', N'Intel Core i5-124O0F - Chính hãng Intel VN', N'GIGABYTE B660M Aorus Pro AX DDR4', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt', N'Gigabyte RTX 3060TI 8GB Eagle OC', N'SSD TEAM MP33 256GB 2.5" NVMe PCle Gen3 x4 (Read 1600 MB/s, Write 1000MB/s)', N'Cooler Master MWE 650 BRONZE V2 230V - 650W 80 Plus Bronze', N'Corsair 4000D Airflow TG Black - ATX (2 Fan)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'11', N'CPU Ryzen 7 5800X 8 nhân 16 luồng', N'Mainboard Gigabyte B550', N'RAM 16GB DDR4', N'Gigabyte RTX 3060 3 fan', N'SSD NVME 256GB', N'Bộ nguồn 750W chuẩn 80Plus Gold', N'Deepcool Matrexx 40 3FS (3 FAN LED)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'2', N'Intel Core i5-10400F - Chính hãng Intel VN', N'GIGABYTE B560M-AORUS ELITE', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Gigabyte RTX 2060 6GB', N'SSD Lexar NM620 256GB M.2 NVMe PCle Gen3 x4 (Read 3000 MB/s, Write 2400 MB/s)', N'Cooler Master MWE 550 BRONZE V2 230V - 650W 80 Plus Bronze', N'Deepcool Matrexx 40 3FS (3 FAN LED)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'3', N'Intel Core 15-11400F - Chính hãng Intel VN', N'GIGABYTE B560M-AORUS ELITE', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4- Tản nhiệt Xám', N'Gigabyte RTX 3060 12GB Gaming OC', N'SSD TEAM MP33 256GB 2.5" NVMe PCle Gen3 x4 (Read 1600 MB/s , Write 1000MB/s)', N'Cooler Master MWE 650 BRONZE V2 230V - 650W 80 Plus Bronze', N'Deepcool Matrexx 40 3FS (3 FAN LED)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'4', N'Intel Core i5-11400F - Chính hãng Intel VN', N'GIGABYTE B560M-AORUS ELITE', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Gigabyte RTX 3060TI 8GB Eagle OC', N'SSD Lexar NM620 256GB M.2 NVMe PCle Gen3 x4 (Read 3000 MB/ s, Write 2400 MB/s)', N'Gigabyte GP-P750GM (750W) - 80 Plus Gold Full Modular', N'Xigmatek Gaming X 3FX - 1 mặt kính ATX (3 FAN RGB)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'5', N'Intel Core i5-11400k - Chính hãng Intel VN', N'GIGABYTE B560M-AORUS ELITE', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Gigabyte RTX 3060TI 8GB Eagle OC', N'SSD Lexar NM620 256GB M.2 NVMe PCle Gen3 x4 (Read 3000 MB/ s, Write 2400 MB/s)', N'Gigabyte GP-P750GM (750W) - 80 Plus Gold Full Modular', N'Xigmatek Gaming X 3FX - 1 mặt kính ATX (3 FAN RGB)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'51', N'Intel Core i3-10105F - Chính hãng Intel VN', N'GIGABYTE H410M-H', N'Ram Team T-Force VulcanZ 8GB 3200 MHz DDR4 - Tản nhiệt Xám', N'Gigabyte GTX 1650 IXOC 4GB DDR5', N'SSD Lexar 128GB NS100 SATA III 2.5"', N'Deepcool DN450 450W - 80 Plus White', N'Xigmatek Aero 2F (đen) - 1 mặt kính')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'52', N'AMD Ryzen 55600G - Chính hãng AMD VN', N'Gigabyte B550M DS3H', N'Ram Team T-Force Vulcanz 16GB (2X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Null', N'SSD TEAM MP33 256GB 2.5" NVMe PCle Gen3 x4 (Read 1600 MB/s, Write 1000MB/s)', N'Null', N'1st Player FireDancing V2-A - MATX 2 mặt kính (4FAN RGB)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'53', N'Intel Core i3-10105F - Chính hãng Intel VN', N'GIGABYTE H410M-H', N'Ram Team T-Force Vulcanz 8GB (1 X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Gigabyte GTX 1650 IXOC 4GB DDR5', N'SSD Lexar 128GB NS100 SATA III 2.5"', N' Deepcool DN450 450W - 80Plus White', N'Xigmatek Aero 2F (đen) -1 mặt kính (2 FAN)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'54', N'Intel Core i3-12100F - Chính hãng Intel VN', N'GIGABYTE H610M-H DDR4', N'Ram Team T-Force Vulcanz 8GB (1 X 8GB) 3200 MHz DDR4 - Tån nhiệt Xám', N'Gigabyte GTX 1650 IXOC 4GB DDR5', N'SSD Lexar 128GB NS100 SATA III 2.5"', N' Deepcool DN450 450W - 80Plus White', N'Xigmatek Aero 2F (đen) -1 mặt kính (2 FAN)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'55', N'Intel Core i5-11400F - Chính hâng Intel VN', N'GIGABYTE B56OM-AORUS ELITE', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt', N'Gigabyte Radeon RX6500 XT 4GB Gaming OC', N'SSD TEAM MP33 256GB 2.5" NVMe PCie Gen3 x4 (Read 1600 MB/s , Write 1000MB/s)', N'Cooler Master MWE 650 BRONZE V2 230V - 650W 80 Plus Bronze', N'Sama LUX - ATX 1 mặt kính (3 fan aRGB)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'56', N'AMD Ryzen 5 5600G - Chính hãng AMD VN', N'Gigabyte B550M DS3H', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt', N'Gigabyte Radeon RX6500 XT 4GB Gaming OC', N'SSD TEAM MP33 256GB 2.5" NVMe PCie Gen3 x4 (Read 1600 MB/s , Write 1000MB/s)', N'Cooler Master MWE 650 BRONZE V2 230V - 650W 80 Plus Bronze', N'Deepcool Matrexx 40 3FS (3 FAN LED)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'6', N'Intel Core i5-12600k - Chính hãng Intel VN', N'GIGABYTE Z690 UD DDR4', N'Ram Team T-Force VulcanZ 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Gigabyte RTX 3070TI 8GB Gaming OC', N'SSD Lexar NM620 256GB M.2 NVMe PCle Gen3 x4 (Read 3000 MB/s, Write 2400 MB/s)', N'Gigabyte GP-P750GM (750W) - 80 Plus Gold Full Modular', N'Deepcool Mattrexx 50 4F ( 4 Fan A-RGB )')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'7', N'Intel Core i5-11400 - Chính hãng Intel VN', N'GIGABYTE B56OM-DS3H', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Null', N'SSD Lexar NM620 256GB M.2 NVMe PCle Gen3 x4 (Read 3000 MB/s, Write 2400 MB/s)', N'Deepcool DN450 450W - 80Plus White', N'Deepcool Macube 110P mATX (Ðen)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'8', N'AMD Ryzen 5 Pro 4650G - Chính hãng AMD VN', N'Gigabyte B550M DS3H', N'Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tản nhiệt Xám', N'Null', N'SSD TEAM MP33 256GB 2.5" NVME PCle Gen3 x4 (Read 1600 MB/s, Write 1000MB/s)', N'Deepcool DN450 450W - 80Plus White', N'Deepcool Macube 110P mATX (Ðen)')
INSERT [dbo].[InfoPC] ([ProductID], [CPU], [Main], [RAM], [VGA], [SSD], [Nguon], [VoCase]) VALUES (N'9', N'Intel Core i5-11400F - Chinh hãng Intel VN', N'GIGABYTE B560OM-DS3H', N'Ram Team T-Force Vulcanz 16GB (2 X 8GB) 3200 MHz DDR4 - Tăn nhiệt Xám', N'Gigabyte GTX 105OTI 4GB', N'SSD Lexar NM620 256GB M.2 NVMe PCle Gen3 x4 (Read 3000 MB/s, Write 2400 MB/s)', N'Deepcool DN450 450W - 80Plus White', N'Deepcool Macube 110P mATX (Ðen)')
GO
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (31, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (32, 10, 33990000, 2)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (33, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (34, 11, 34990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (35, 12, 35490000, 2)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (36, 1, 22990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (37, 13, 25490000, 4)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (38, 60, 1190000, 2)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (39, 60, 1190000, 3)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (40, 61, 2200000, 5)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (41, 62, 290000, 7)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (42, 13, 25490000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (43, 11, 34990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (44, 11, 34990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (45, 15, 22490000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (46, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (47, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (48, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (49, 13, 25490000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (50, 1, 22990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (51, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (52, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (53, 10, 33990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (54, 11, 34990000, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [Price], [Quantity]) VALUES (55, 10, 33990000, 1)
GO
SET IDENTITY_INSERT [dbo].[Orders] ON 

INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (31, N'1', CAST(N'2022-03-16' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (32, N'1', CAST(N'2022-03-16' AS Date), 67980000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (33, N'1', CAST(N'2022-03-16' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (34, N'1', CAST(N'2022-03-16' AS Date), 34990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (35, N'1', CAST(N'2022-03-16' AS Date), 70980000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (36, N'1', CAST(N'2022-03-16' AS Date), 57980000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (37, N'1', CAST(N'2022-03-16' AS Date), 101960000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (38, N'1', CAST(N'2022-03-16' AS Date), 2380000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (39, N'1', CAST(N'2022-03-16' AS Date), 35700000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (40, N'1', CAST(N'2022-03-16' AS Date), 11000000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (41, N'1', CAST(N'2022-03-16' AS Date), 2030000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (42, N'Dao', CAST(N'2022-03-16' AS Date), 25490000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (43, N'1', CAST(N'2022-03-16' AS Date), 34990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (44, N'1', CAST(N'2022-03-16' AS Date), 34990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (45, N'1', CAST(N'2022-03-16' AS Date), 22490000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (46, N'1', CAST(N'2022-03-16' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (47, N'1', CAST(N'2022-03-17' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (48, N'1', CAST(N'2022-03-17' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (49, N'1', CAST(N'2022-03-17' AS Date), 25490000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (50, N'1', CAST(N'2022-03-17' AS Date), 22990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (51, N'1', CAST(N'2022-03-17' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (52, N'1', CAST(N'2022-03-17' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (53, N'1', CAST(N'2022-03-17' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (54, N'1', CAST(N'2022-03-17' AS Date), 34990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (55, N'1', CAST(N'2022-03-17' AS Date), 33990000.0000)
INSERT [dbo].[Orders] ([OrderID], [UserID], [OrderDate], [TotalPrice]) VALUES (56, N'1', CAST(N'2022-03-17' AS Date), 0.0000)
SET IDENTITY_INSERT [dbo].[Orders] OFF
GO
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'1', N'PC X-LINK', N'1', N'images/p1.jpg', 22990000, 19)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'10', N'PC Alder Wifi', N'1', N'images/p10.jpg', 33990000, 13)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'11', N'PC Graphite Ryzen 7', N'1', N'images/p11.jpg', 34990000, 17)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'12', N'Laptop Gaming MSI Alpha 17 B5EEK 031VN', N'2', N'images/l12.jpg', 35490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'13', N'Laptop Gaming MSI Bravo 15 B5DD 264VN', N'2', N'images/l13.jpg', 25490000, 18)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'14', N'Laptop Gaming MSI Bravo 15 B5DD 275VN', N'2', N'images/l14.jpg', 25490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'15', N'Laptop Gaming MSI Bravo 15 B5DD 276VN', N'2', N'images/l15.jpg', 22490000, 19)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'16', N'Laptop Gaming MSI Katana GF76 11UE 446VN', N'2', N'images/l16.jpg', 36990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'17', N'Laptop Gaming MSI Katana GF66 11UE 824VN', N'2', N'images/l17.jpg', 35990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'18', N'Laptop Gaming MSI Katana GF76 11UD 688VN', N'2', N'images/l18.jpg', 31490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'19', N'Laptop Gaming MSI Katana GF66 11UC 696VN', N'2', N'images/l19.jpg', 30990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'2', N'PC X Win Intel', N'1', N'images/p2.jpg', 24490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'20', N'Laptop Gaming MSI GE76 Raider 12UHS 480VN', N'2', N'images/l20.jpg', 99990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'21', N'Laptop Gaming MSI GE66 Raider 11UH 211VN', N'2', N'images/l21.jpg', 77990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'22', N'Laptop Gaming MSI GS77 Stealth 12UH 075VN', N'2', N'images/l22.jpg', 89990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'23', N'Laptop Gaming MSI GS66 Stealth 12UGS 227VN', N'2', N'images/l23.jpg', 69990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'26', N'Laptop Gaming MSI GS66 Stealth 11UG 210VN', N'2', N'images/l26.jpg', 64990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'3', N'PC X Cyber Intel', N'1', N'images/p3.jpg', 27490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'4', N'PC X Dream Intel', N'1', N'images/p4.jpg', 31490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'5', N'PC X KNIGHT', N'1', N'images/p5.jpg', 37490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'51', N'PC Xgear Cub Intel', N'1', N'images/p51.jpg', 12990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'52', N'PC Xgear Ryzen 5', N'1', N'images/p52.jpg', 12490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'53', N'PC Xgear Eagle Intel', N'1', N'images/p53.jpg', 13990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'54', N'PC Xgear Air Intel', N'1', N'images/p54.jpg', 14490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'55', N'PC Xgear FUSE', N'1', N'images/p55.jpg', 19490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'56', N'PC Xgear Strike Ryzen', N'1', N'images/p56.jpg', 20490000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'6', N'PC X MAGNUM', N'1', N'images/p6.jpg', 46990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'60', N'PC X KNIGHT 2', N'3', N'images/p5.jpg', 1190000, 100)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'61', N'PC X KNIGHT 3', N'4', N'images/p5.jpg', 2200000, 100)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'62', N'PC X KNIGHT 3', N'5', N'images/p5.jpg', 290000, 100)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'7', N'PC Graphite', N'1', N'images/p7.jpg', 12890000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'8', N'PC Graphite Ryzen 5', N'1', N'images/p8.jpg', 12990000, 20)
INSERT [dbo].[Products] ([ProductID], [ProductName], [CategoryID], [Img], [Price], [Amount]) VALUES (N'9', N'PC Graphite', N'1', N'images/p9.jpg', 16490000, 20)
GO
ALTER TABLE [dbo].[InfoLab]  WITH CHECK ADD FOREIGN KEY([ProductID])
REFERENCES [dbo].[Products] ([ProductID])
GO
ALTER TABLE [dbo].[InfoPC]  WITH CHECK ADD FOREIGN KEY([ProductID])
REFERENCES [dbo].[Products] ([ProductID])
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders] ([OrderID])
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_ProductID] FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders] ([OrderID])
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_ProductID]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_UserID] FOREIGN KEY([UserID])
REFERENCES [dbo].[Accounts] ([UserID])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_UserID]
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD  CONSTRAINT [FK_CategoryID] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Categories] ([CategoryID])
GO
ALTER TABLE [dbo].[Products] CHECK CONSTRAINT [FK_CategoryID]
GO
