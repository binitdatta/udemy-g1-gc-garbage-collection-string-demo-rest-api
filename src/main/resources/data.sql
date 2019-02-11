INSERT INTO `g1_gc_demo_db`.`rollingstone_filter`
(`id`,
`actual_search_term`,
`device_type`,
`include_drug`,
`page_numberr`,
`populate_channel_avail_map`,
`rec_per_page`,
`request_type`,
`search_criteria`,
`sort`,
`view`)
VALUES
(1,
'nail polish',
'desktop',
1,
24,
1,
24,
'search',
'nail polish',
'relevance',
'allView');


INSERT INTO `g1_gc_demo_db`.`rollingstone_summary`
(`id`,
`all_web_and_store_total_results`,
`drug_info_count`,
`frequently_used_filter`,
`in_store_total_results`,
`page_number`,
`product_info_count`,
`total_num_pages`)
VALUES
(1,
120,
2,
'Product Type',
114,
1,
150,
24);

INSERT INTO `g1_gc_demo_db`.`rollingstone_product_info`
(`id`,`auto_reorder`,`beauty_category_name`,`clearance`,`fulfiller_type`,`image_url`,
`inactive_ingredients`,`loyalty_eligible`,`new_item`,`pln`,`prod_id`,`product_display_name`,
`product_display_type`,`product_size`,`producturl`,`quicklookurl`,`retail_unit_qty`,
`review_count`,`review_hover_message`,`reviewurl`,`sku_id`,`store_inv`,`unit_price`,
`unit_price_size`,`upc`,`web_exclusive`,`wic`,`filter_id`,`summary_id`)
VALUES
(1,  1000,'Sally Hansen','No','DC','//pics.drugstore.com/prodimg/561019/155.jpg',
'Dimethicone,  Silica, Aluminum Calcium Sodium Silicate','Yes','No','1234556',
'P1028484838','Nail Polish_P1028484838','Show','20 ML','TBD','TBD','5',100,'TBD','TBD',
'10001','120',9.99,'OZ','P1020202','TBD','TBD',1,1);



INSERT INTO `g1_gc_demo_db`.`rollingstone_banner`
(`id`,
`bannercacontent`,
`display_name`,
`href`,
`image_alt_text`,
`image_url`,
`rel`,
`product_id`)
VALUES
(1,
'NA',
'NA',
'/topic/brand/no7-beauty-store.jsp?ban=dl_dlendeca_No7',
'Discover the No7 Beauty Store. Explore No7.',
'/topic/brand/no7-beauty-store.jsp?ban=dl_dlendeca_No7',
'banner',
1);

INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(5000015137,
4,
'Yellow',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(5000015147,
6,
'Red',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(5000015147,
6,
'Red',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(5000016267,
12,
'Blue',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(5000016287,
12,
'Black',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(5000016297,
12,
'Skyblue',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(5000028297,
3,
'White',
1);
INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(6000028297,
4,
'Seablue',
1);



INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(6000027297,
4,
'Palegreen',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_tier2refinements`
(`id`,
`count`,
`name`,
`product_id`)
VALUES
(6000023297,
4,
'ChromeYellow',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(1,
'Adrenaline Crush',
'5000018435',
'Adrenaline Crush Nail olish',
10,
'sku6292665',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'986177',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(2,
'Red Eye',
'5000018435',
'Red Eye Nail olish',
10,
'sku6204924',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'986177',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(3,
'Electric Pop',
'2999952517',
'Electric Pop Nail olish',
10,
'sku6257636',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'925104',
1);

INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(4,
'Dig Fig',
'3000008954',
'Dig Fig Nail olish',
10,
'sku6204921',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'351484',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(5,
'Flash-ionista',
'2999952505',
'Flash-ionista Nail olish',
10,
'sku6257648',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'925116',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(6,
'Wine Stock',
'3000008950',
'Wine Stock Nail olish',
10,
'sku6204925',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'925116',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(7,
'Scarlet Starlet',
'2999952514',
'Scarlet Starlet Nail olish',
10,
'sku6257639',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'925107',
1);


sku6204894

INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(9,
'Tipsy Gypsy',
'2999953677',
'Tipsy Gypsy Nail olish',
10,
'sku6240507',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'906072',
1);


INSERT INTO `g1_gc_demo_db`.`rollingstone_product_sku`
(`id`,
`color`,
`dim_id`,
`name`,
`quantity`,
`sku_id`,
`sku_sequence_number`,
`swatch_image_url`,
`wic`,
`product_id`)
VALUES
(10,
'Pink Stiletto',
'2999952506',
'Pink Stiletto Nail olish',
10,
'sku6257647',
1,
'//pics.drugstore.com/prodimg/526455/plain_50.jpg',
'925115',
1);
