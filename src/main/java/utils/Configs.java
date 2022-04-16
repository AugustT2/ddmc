package utils;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Configs {

    /**
     * 2970nong
     */
//    public static final String stationId = "5be3aae5716de100468c17c6";
//    public static final String addressId = "5e3ca2b40db8ca17b041a477";
//    public static final String cityNumber = "0101";
//    public static final Double latitude = 121.578212;
//    public static final Double longitude = 31.276664;

    /**
     * beijing
     */
    public static final String stationId = "5fb7682be820e30001ef080b";
    public static final String addressId = "62497a77bda7170001727c42";
    public static final String cityNumber = "0101";
    public static final Double latitude = 39.959971;
    public static final Double longitude = 116.315196;

    public static final String cookie = "DDXQSESSID=dbfb6bfa2e09672047ff71f078d2ffc4";
    public static final String uid = "5e3389460db8ca355732faf4";
    public static final String deviceToken = "WHJMrwNw1k/FKPjcOOgRd+PWehiLWOygJ/RZ9DQpewiwhBgHdGyfcEaeo9PgWIUlEaFLgdFsPfC5ZM1YLWMsMv+Gl0RScTHGOdCW1tldyDzmauSxIJm5Txg==1487582755342";

    /**
     * 默认为给到 APP
     * 如需设置小程序，请修改：
     * appClientId 3 -> 4
     * payType 11 -> 6
     * <p>
     * 注意，小程序的 api 版本与给到不同
     * 给到: apiVersion 9.44.0、 appVersion 2.74.2
     * 小程序: apiVersion 9.49.2、 appVersion 2.82.0
     */

    public static final String appClientId = "4"; // 小程序请设置为 4
    public static final Integer payType = 6; // 小程序请设置为 6
    public static final String apiVersion = "9.50.0";
    public static final String appVersion = "2.83.0";

    /**
     * 由于时间段有时会更新，所以需要配置一下时间段，单位 秒。
     * 请根据购物车结算页面实际的日期范围填写
     * TIME_INTERVAL： 时间段间隔
     * 如需禁用某个时间段，将 PERIODS，中对应的时间段注释掉即可。
     */

    public static final long BEGIN = 6 * 60 * 60 + 30 * 60;
    private static final LocalDateTime TODAY_ZERO = getTodayZero();

    // 默认为 2 小时间隔。

/*    public static final long TIME_INTERVAL = 30 * 60;
    public static final List<LocalDateTime> PERIODS = Arrays.asList(
            TODAY_ZERO.plusSeconds(BEGIN),   // 6:30 - 8:30
            TODAY_ZERO.plusSeconds(BEGIN + TIME_INTERVAL), // 8:30 - 10:30
            TODAY_ZERO.plusSeconds(BEGIN + 2 * TIME_INTERVAL), // 10:30 - 12:30
            TODAY_ZERO.plusSeconds(BEGIN + 3 * TIME_INTERVAL), // 12:30 - 14:30
            TODAY_ZERO.plusSeconds(BEGIN + 4 * TIME_INTERVAL), // 14:30 - 16:30
            TODAY_ZERO.plusSeconds(BEGIN + 5 * TIME_INTERVAL), // 16:30 - 18:30
            TODAY_ZERO.plusSeconds(BEGIN + 6 * TIME_INTERVAL),  // 18:30 - 20:30
          TODAY_ZERO.plusSeconds(BEGIN + 7 * TIME_INTERVAL) // 20:30 - 22:30 (注释掉以后将不会下单到此时间)*/

    public static final long TIME_INTERVAL = 8 * 60 * 60;
    public static final List<LocalDateTime> PERIODS = Arrays.asList(
            TODAY_ZERO.plusSeconds(BEGIN),   // 6:30 - 14:30
            TODAY_ZERO.plusSeconds(BEGIN + TIME_INTERVAL) // 14:30 - 20:30
    );

    /**
     * 贴心的准备了其余的选项
     * 4 小时间隔
     */
//    public static final long TIME_INTERVAL = 4 * 60 * 60;
//    public static final List<LocalDateTime> PERIODS = Arrays.asList(
//            TODAY_ZERO.plusSeconds(BEGIN),   // 6:30 - 10:30
//            TODAY_ZERO.plusSeconds(BEGIN + TIME_INTERVAL), // 10:30 - 14:30
//            TODAY_ZERO.plusSeconds(BEGIN + 2 * TIME_INTERVAL), // 14:30 - 18:30
//            TODAY_ZERO.plusSeconds(BEGIN + 3 * TIME_INTERVAL) // 18:30 - 22:30
//    );

    /**
     * 8 小时间隔
     */
//    public static final long TIME_INTERVAL = 8 * 60 * 60;
//    public static final List<LocalDateTime> PERIODS = Arrays.asList(
//            TODAY_ZERO.plusSeconds(BEGIN),   // 6:30 - 14:30
//            TODAY_ZERO.plusSeconds(BEGIN + TIME_INTERVAL), // 14:30 - 22:30
//    );
    private static LocalDateTime getTodayZero() {
        return LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).withNano(0);
    }
}
