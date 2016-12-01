package me.bakumon.gank.network.api;

import me.bakumon.gank.model.GankBeautyResult;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * gank.io
 * Created by bakumon on 16-12-1.
 */

public interface GankApi {
    @GET("data/福利/{number}/{page}")
    Observable<GankBeautyResult> getBeauties(@Path("number") int number, @Path("page") int page);
}
