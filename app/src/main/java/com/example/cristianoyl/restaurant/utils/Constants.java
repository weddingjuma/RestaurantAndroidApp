package com.example.cristianoyl.restaurant.utils;

/**
 * Created by CristianoYL on 8/3/17.
 */

public class Constants {
    // request related
    public static final int CONN_TIME_OUT = 10000;
    public static final int READ_TIME_OUT = 10000;
    public static final String SERVER_CHARSET = "UTF-8";
    public static final String MSG_TIME_OUT = "Connection timeout.";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_DEL = "DELETE";
    public static final String METHOD_PUT = "PUT";
    public static final String ACCESS_TOKEN = "access_token";

    // stripe config
    public static final String STRIPE_PUBLISHABLE_KEY = "pk_test_cvvvvcgwdJl04LlL1u7i97Pn";
    public static final String STRIPE_API_VERSION = "2017-08-15";

    // key words
    public static final String KEY_DESC = "description";
    public static final String KEY_MSG = "message";
    public static final String EPHEMERAL_KEY = "ephemeral_key";

    // model names
    public static final String MODEL_USER = "user";
    public static final String MODEL_RESTAURANT = "restaurant";
    public static final String MODEL_MENU = "menu";

    // model list names
    public static final String LIST_RESTAURANT = "restaurants";
    public static final String LIST_MENU = "menus";

    // model fields
    // user model
    public static final String USER_ID = "id";
    public static final String USER_PHONE = "phone";
    public static final String USER_PASSWORD = "password";
    // restaurant model
    public static final String RESTAURANT_ID = "id";
    public static final String RESTAURANT_NAME = "name";
    public static final String RESTAURANT_FEE = "fee";
    public static final String RESTAURANT_LIMIT = "limit";
    public static final String RESTAURANT_ADDRESS = "address";
    public static final String RESTAURANT_OPEN_TIME = "openTime";
    public static final String RESTAURANT_CLOSE_TIME = "closeTime";
    public static final String RESTAURANT_IS_OPEN = "isOpen";
    public static final String RESTAURANT_LOGO = "logo";
    public static final String RESTAURANT_PROMO = "promo";
    public static final String RESTAURANT_PHONE = "phone";
    // menu model
    public static final String MENU_ID = "id";
    public static final String MENU_RID = "rid";
    public static final String MENU_NAME = "name";
    public static final String MENU_PRICE = "price";
    public static final String MENU_CATEGORY = "category";
    public static final String MENU_DESCRIPTION = "description";
    public static final String MENU_SPICY = "spicy";
    public static final String MENU_IS_AVAILABLE = "isAvailable";
    public static final String MENU_IS_RECOMMENDED = "isRecommended";

    public static final String CATEGORY_CHEF_RECOMMENDED = "Chef's Recommendation";


    // fragment tags
    public static final String FRAGMENT_RESTAURANT= "restaurant_fragment";
    public static final String FRAGMENT_MENU= "menu_fragment";
    public static final String FRAGMENT_ORDER= "order_fragment";
    public static final String FRAGMENT_CARD= "card_fragment";

    // app configs
    public static final double TAX_RATE= 0.07;
    public static final int LOCATION_RESULT_COUNT= 5;
    public static final int LOCALE_PHONE_NUMBER_LENGTH= 14;


    // Location service related values
    public static final int SUCCESS_RESULT = 0;
    public static final int FAILURE_RESULT = 1;
    public static final String LOCATION_RECEIVER = "LOCATION_RECEIVER";
    public static final String RESULT_DATA_KEY = "RESULT_DATA_KEY";
    public static final String LOCATION_DATA_EXTRA = "LOCATION_DATA_EXTRA";
    public static final String ADDRESS_DATA_EXTRA = "ADDRESS_DATA_EXTRA";
    public static final float DEFAULT_ZOOM = 16;

    // Image service related values
    public static final String IMAGE_RECEIVER = "IMAGE_RECEIVER";
    public static final String IMAGE_URL_EXTRA = "IMAGE_URL_EXTRA";
    public static final String IMAGE_BITMAP_EXTRA = "IMAGE_BITMAP_EXTRA";

}
