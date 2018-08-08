package com.fictitious.inherit.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @Author dubaolong
 * @Date 2018/8/8 09:30
 * @PackageName com.fictitious.inherit.api
 */
@Path("/user")
@Consumes("application/json")
@Produces("application/json")
public interface UserResource {

    /**
     * 用户登录接口
     *
     * @param name
     * @return
     */
    @POST
    @Path("loginInfo")
    void loginInfo(String name);
}
