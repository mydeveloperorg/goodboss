package com.goodboss.util;

public class JsonResult {
    private boolean success = true;
    private String msg = "成功了";

    public JsonResult() {
    }

    public JsonResult(String msg) {
        this.success = false;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public JsonResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public JsonResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}
