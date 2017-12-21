package com.umarfadil.loginregisterreftofit.util;

/**
 * Created by umarfadil on 12/21/17.
 */

public class UtilsApi {

    // 10.0.2.2 ini adalah localhost.
    public static final String BASE_URL_API = "http://192.168.100.5/InvitationApps/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }

}
