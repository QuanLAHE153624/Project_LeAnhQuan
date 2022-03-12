CREATE DATABASE [FoodyShop]
GO
USE [FoodyShop]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[address] [varchar](255) NULL,	
	[user] [varchar](255) NULL,
	[pass] [varchar](255) NULL,
	[isAdmin] [int] NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[uID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[id] [int] IDENTITY(1,1) not null,
	[AccountID] [int] NULL,	
	[Total] [money] NULL
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[OrderID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Quantity] [int] NULL,
	[price] [money] NULL
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC,
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[cid] [int] NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NULL,
	[image] [nvarchar](max) NULL,
	[price] [money] NULL,
	[title] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[Quantity] [int] NULL,
	[cateID] [int] NULL	
 CONSTRAINT [PK_product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 


INSERT [dbo].[Account] ([uID],[name],[phone],[address], [user], [pass], [isAdmin]) VALUES (1,N'Le Anh Quan',N'0986868686',N'Nghe An', N'admin', N'123', 1)
INSERT [dbo].[Account] ([uID],[name],[phone],[address], [user], [pass], [isAdmin]) VALUES (2,N'Nguyen Van A',N'0956481235',N'Ha Noi', N'sa', N'123', 0)
INSERT [dbo].[Account] ([uID],[name],[phone],[address], [user], [pass], [isAdmin]) VALUES (3,N'Nguyen Van B',N'0985461257',N'Tp HCM', N'abc', N'123', 0)

SET IDENTITY_INSERT [dbo].[Account] OFF
INSERT [dbo].[Category] ([cid], [cname]) VALUES (1, N'Spicy sticks')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (2, N'Snacks')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (3, N'Drinks')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (4, N'Instant food')
SET IDENTITY_INSERT [dbo].[product] ON 

INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (1, N'Chicken taste', N'images/product-1.jpg', 120, N'Chicken taste', N'Beijing roast chicken flavorful sticks are delicious and nutritious.',500, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (2, N'Chicken wings snack', N'images/product-3.jpg', 125, N'Chicken wings snack',N'Chicken wings snack with super delicious spices, super crispy, not bored.',500, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (3, N'Beef taste', N'images/product-4.jpg', 130, N'Beef taste',N'The spicy beef flavor from Yunnan, China is a famous specialty with the rich and sweet taste of beef.' ,500, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (4, N'Crunchy biscuits', N'images/product-5.jpg', 140, N'Crunchy biscuits',N'Crispy crackers are super crispy, sweet, creamy and chocolate mingle.' ,500, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (5, N'Squid taste', N'images/product-6.jpg', 120, N'Squid taste',N'The spicy squid taste from the waters of Guangdong is super spicy and chewy with the taste of the sea.',500, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (6, N'Duck taste',N'images/product-7.jpg', 200,N'Duck taste', N'Beijing roast duck super spicy and delicious stick super delicious to eat forever.',500, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (7, N'Rio drinks', N'images/product-8.jpg', 170, N'Rio drinks',N'A famous Chinese drink is sought after by the young Vietnamese.' ,500, 3)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (8, N'Self-boiled hot pot',N'images/product-9.jpg', 150 ,N'Self-boiled hot pot' , N'The hotpot itself boils with the ability to self-boil after adding water to a dedicated self-boiling package to heat and cook food and enjoy crickets anytime, anywhere.',500, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (9, N'Squid snack', N'images/product-2.jpg', 180,N'Squid snack' ,N'The squid snack is super crispy and fragrant with the squid flavor of the Chinese seas.' ,500, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (10, N'Hotpot noodule', N'images/product-10.jpg', 200,N'Hotpot noodule' ,N'Hot pot or hotpot, also known as soup-food or steamboat, is a cooking method that originated in China.' ,500, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (11, N'Beer TsingTao', N'images/product-13.jpg', 100,N'Beer TsingTao' ,N'Tsingtao beer (aka Qingdao beer) is China number one lager beer' ,500, 3)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description],[Quantity], [cateID]) VALUES (12, N'Spicy chicken feet', N'images/product-14.jpg', 180,N'Spicy chicken feet' ,N'These braised Chicken Feet are cooked long and slow in a rich sauce.' ,500, 4)

SET IDENTITY_INSERT [dbo].[product] OFF
go
alter table [dbo].[product] with check add constraint [FK_Category] foreign key ([cateID]) references [dbo].[Category] ([cid])
go
alter table [dbo].[Order] with check add constraint [FK_Order_Account] foreign key ([AccountID]) references [dbo].[Account] ([uID])
go
alter table [dbo].[Order]  check constraint [FK_Order_Account]
go
alter table [dbo].[OrderDetail] with check add constraint [FK_Order_OrderDetail] foreign key ([OrderID]) references [dbo].[Order] ([id])
go
alter table [dbo].[OrderDetail]  check constraint [FK_Order_OrderDetail]
go
alter table [dbo].[OrderDetail] with check add constraint [FK_Product_OrderDetail] foreign key ([ProductID]) references [dbo].[product] ([id])
go
alter table [dbo].[OrderDetail]  check constraint [FK_Product_OrderDetail]
go