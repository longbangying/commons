package com.xbang.commons.dubbo.api;

import com.xbang.commons.dubbo.entity.UserInfo;

import java.util.concurrent.CompletableFuture;

public interface TestService {

    String test(String test);

    CompletableFuture<UserInfo> getUserInfo();

    UserInfo getUserInfo1();


}
