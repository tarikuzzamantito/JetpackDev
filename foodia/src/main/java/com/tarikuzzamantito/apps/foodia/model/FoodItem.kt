package com.tarikuzzamantito.apps.foodia.model

import androidx.compose.runtime.Immutable

/**
 * Created by Tarikuzzaman Tito on 8/17/2024 11:25 PM
 */
@Immutable
data class FoodItem(
    val id: Long,
    val name: String,
    val imageUrl: String,
    val price: Long,
    val tagline: String = "",
    val tags: Set<String> = emptySet()
)

val foodItems = listOf(
    FoodItem(
        id = 2L,
        name = "Pizza",
        tagline = "A Slice of Heaven!",
        imageUrl = "https://images.unsplash.com/photo-1576458088443-04a19bb13da6?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        price = 299
    ),
    FoodItem(
        id = 3L,
        name = "Pasta",
        tagline = "Indulge in Pasta Paradise!!",
        imageUrl = "https://cnd.pixabay.com/photo/2019/03/02/14/26/shawarma-4029889_960_720.jpg",
        price = 299
    ),
    FoodItem(
        id = 4L,
        name = "Beef",
        tagline = "Savor the Richness",
        imageUrl = "https://cdn.pixabay.com/photo/2020/04/04/15/08/barbecue-5002645_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 5L,
        name = "Bread",
        tagline = "Baked to Perfection!",
        imageUrl = "https://cdn.pixabay.com/photo/2023/12/13/17/54/bun-8447394_960_720.jpg",
        price = 299
    ),
    FoodItem(
        id = 6L,
        name = "French Fries",
        tagline = "Crispy and Irresistible!",
        imageUrl = "https://cdn.pixabay.com/photo/2022/07/15/18/12/bacon-poutine-7323673_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 7L,
        name = "Biryani",
        tagline = "A Flavor Explosion!",
        imageUrl = "https://cdn.pixabay.com/photo/2023/10/19/11/18/biryani-8326234_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 8L,
        name = "Shawarma",
        tagline = "A Middle Eastern Delight!",
        imageUrl = "https://cdn.pixabay.com/photo/2022/03/11/10/06/wrap-7061741_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 9L,
        name = "Sandwich",
        tagline = "Layers of Flavor!",
        imageUrl = "https://cdn.pixabay.com/photo/2019/11/19/18/33/sandwich-4638226_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 10L,
        name = "Pancake",
        tagline = "Morning Bliss on a Plate!",
        imageUrl = "https://cdn.pixabay.com/photo/2017/09/30/12/12/pancakes-2801959_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 11L,
        name = "Sushi",
        tagline = "Exquisite Japanese Delicacy!",
        imageUrl = "https://cdn.pixabay.com/photo/2020/04/04/15/07/sushi-5002639_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 12L,
        name = "Burrito",
        tagline = "A Taste of Mexico!",
        imageUrl = "https://cdn.pixabay.com/photo/2020/07/09/19/53/food-5388580_1280.jpg",
        price = 299
    ),
    FoodItem(
        id = 13L,
        name = "Curry",
        tagline = "Spice up Your Life!",
        imageUrl = "https://cdn.pixabay.com/photo/2016/10/13/05/16/thai-curry-1736806_960_720.jpg",
        price = 299
    ),
    FoodItem(
        id = 14L,
        name = "Fried Chicken",
        tagline = "Crunchy Goodness!",
        imageUrl = "https://images.unsplash.com/photo-1637273484026-11d51fb64024?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Y2hpY2tlbiUyMHdpbmdzfGVufDB8fDB8fHww",
        price = 299
    ),
    FoodItem(
        id = 15L,
        name = "Chips",
        tagline = "Crunchy Snack Time!",
        imageUrl = "https://source.unsplash.com/UsSdMZ78Q3E",
        price = 299
    ),
    FoodItem(
        id = 16L,
        name = "Pretzels",
        tagline = "Twist and Crunch!",
        imageUrl = "https://source.unsplash.com/7meCnGCJ5Ms",
        price = 299
    ),
    FoodItem(
        id = 17L,
        name = "Smoothies",
        tagline = "Refreshing and Nutritious!",
        imageUrl = "https://source.unsplash.com/m741tj4Cz7M",
        price = 299
    ),
    FoodItem(
        id = 18L,
        name = "Popcorn",
        tagline = "Movie Night Essential!",
        imageUrl = "https://source.unsplash.com/iuwMdNq0-s4",
        price = 299
    ),
    FoodItem(
        id = 19L,
        name = "Almonds",
        tagline = "Healthy Snacking!",
        imageUrl = "https://source.unsplash.com/qgWWQU1SzqM",
        price = 299
    ),
    FoodItem(
        id = 20L,
        name = "Cheese",
        tagline = "Say Cheese!",
        imageUrl = "https://source.unsplash.com/9MzCd76xLGk",
        price = 299
    ),
    FoodItem(
        id = 21L,
        name = "Apples",
        tagline = "An Apple a Day...",
        imageUrl = "https://source.unsplash.com/1d9xXWMtQzQ",
        price = 299
    ),
    FoodItem(
        id = 22L,
        name = "Apple sauce",
        tagline = "Smooth and Delicious!",
        imageUrl = "https://source.unsplash.com/wZxpOw84QTU",
        price = 299
    ),
    FoodItem(
        id = 23L,
        name = "Apple chips",
        tagline = "Crispy Apple Goodness!",
        imageUrl = "https://source.unsplash.com/okzeRxm_GPo",
        price = 299
    ),
    FoodItem(
        id = 24L,
        name = "Apple juice",
        tagline = "Pure Refreshment!",
        imageUrl = "https://source.unsplash.com/l7imGdupuhU",
        price = 299
    ),
    FoodItem(
        id = 25L,
        name = "Apple pie",
        tagline = "Warm and Comforting!",
        imageUrl = "https://source.unsplash.com/bkXzABDt08Q",
        price = 299
    ),
    FoodItem(
        id = 26L,
        name = "Grapes",
        tagline = "Naturally Sweet!",
        imageUrl = "https://source.unsplash.com/y2MeW00BdBo",
        price = 299
    ),
    FoodItem(
        id = 27L,
        name = "Kiwi",
        tagline = "Tangy and Tropical!",
        imageUrl = "https://source.unsplash.com/1oMGgHn-M8k",
        price = 299
    ),
    FoodItem(
        id = 13L,
        name = "Mango",
        tagline = "Juicy Mango Madness!",
        imageUrl = "https://cdn.pixabay.com/photo/2018/05/07/11/22/mango-3380631_1280.jpg",
        price = 299
    )
)
