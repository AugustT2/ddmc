# 给到叮咚买菜

> 本项目使用 关爱通积分进行付款。

**目前仅支持给到叮咚买菜，其他的懒得适配了，应该是通用的只需要改几个参数，我自己用不着**

**Step0**: Star 本项目。

**Step1**: 使用抓包工具抓取给到叮咚买菜的请求。

抓包工具:

- Android: AndroidHttpCapture https://github.com/JZ-Darkal/AndroidHttpCapture

- IOS: Stream https://apps.apple.com/cn/app/stream/id1312141691

开启抓包后，进入购物车，重新选一下地址触发 这个 -> `/order/getMultiReserveTime` <- 请求。

在 Body 里找到相关参数，在 Header 里找到 Cookie。

**Step2**: 填入参数到 Configs.java 中。

- stationId: 站点 id
- cityNumber: 城市代码
- latitude: 纬度
- longitude: 经度
- cookie: cookie
- uid: 用户编号
- deviceToken: 设备 token

**Step3**: 将你需要的菜加入到购物车并打上勾。

**Step4**: Run Entry.main()。

**Step5**: 输入 Y，确认开始买菜。

**Step6**: 开始抢菜后会滚动刷新请求信息直到 success。

**Step7**: 打开给到叮咚付款。

## 原理

- 根据时间段建立多个线程，调用新增订单接口 /order/addNewOrder
- 时间段的定义在 Requests 中。（仅适用于上海，其他的时间段貌似不同）

## 免责声明

本项目仅供交流学习，严禁用作商业行为，特别禁止黄牛加价代抢等！

因违法违规等不当使用导致的后果与本人无关，如有任何问题可联系本人删除！

## 写在最后

祝大家平安度过疫情，不要在家饿着。 💗
