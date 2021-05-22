package cn.com.xia.welfare;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import cn.com.xia.welfare.bean.BaseBall;
import cn.com.xia.welfare.bean.DLTBall;
import cn.com.xia.welfare.bean.KLBBall;
import cn.com.xia.welfare.bean.LJYBall;
import cn.com.xia.welfare.bean.PLWBall;
import cn.com.xia.welfare.bean.QLCBall;
import cn.com.xia.welfare.bean.QWSBall;
import cn.com.xia.welfare.bean.QXCBall;
import cn.com.xia.welfare.bean.SSQBall;

public class Utilities {

    /****
     * 随机获取五注大乐透
     * @param RedList
     * @param BlueList
     * @return
     */
    public static List<DLTBall> getDltFive(List<BaseBall> RedList,List<BaseBall> BlueList)
    {
        List<DLTBall> dltBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp1 = deepCopyList(RedList);
            List<BaseBall> blueListTmp1 = deepCopyList(BlueList);

            DLTBall dltBall = getDltOne(redListTmp1,blueListTmp1);

            dltBalls.add(dltBall);
        }

        return dltBalls;
    }

    /****
     * 随机获取一注大乐透
     * @param RedList
     * @param BlueList
     * @return
     */
    public static DLTBall getDltOne(List<BaseBall> RedList,List<BaseBall> BlueList)
    {
        DLTBall dltBall = new DLTBall();

        List<BaseBall> redListTmp1 = deepCopyList(RedList);
        dltBall.setR1(getRandomBall(redListTmp1));
        dltBall.setR2(getRandomBall(redListTmp1));
        dltBall.setR3(getRandomBall(redListTmp1));
        dltBall.setR4(getRandomBall(redListTmp1));
        dltBall.setR5(getRandomBall(redListTmp1));

        List<BaseBall> blueListTmp1 = deepCopyList(BlueList);
        dltBall.setB1(getRandomBall(blueListTmp1));
        dltBall.setB2(getRandomBall(blueListTmp1));

        dltBall.sortAll();

        return dltBall;
    }

    /****
     * 随机获取五注双色球
     * @param RedList
     * @param BlueList
     * @return
     */
    public static List<SSQBall> getSsqFive(List<BaseBall> RedList, List<BaseBall> BlueList)
    {
        List<SSQBall> ssqBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp = deepCopyList(RedList);
            List<BaseBall> blueListTmp = deepCopyList(BlueList);

            SSQBall dltBall = getSsqOne(redListTmp,blueListTmp);

            ssqBalls.add(dltBall);
        }

        return ssqBalls;
    }

    /****
     * 随机获取一注双色球
     * @param RedList
     * @param BlueList
     * @return
     */
    public static SSQBall getSsqOne(List<BaseBall> RedList,List<BaseBall> BlueList)
    {
        SSQBall ssqBall = new SSQBall();

        List<BaseBall> redListTmp = deepCopyList(RedList);
        ssqBall.setR1(getRandomBall(redListTmp));
        ssqBall.setR2(getRandomBall(redListTmp));
        ssqBall.setR3(getRandomBall(redListTmp));
        ssqBall.setR4(getRandomBall(redListTmp));
        ssqBall.setR5(getRandomBall(redListTmp));
        ssqBall.setR6(getRandomBall(redListTmp));

        List<BaseBall> blueListTmp1 = deepCopyList(BlueList);
        ssqBall.setB1(getRandomBallNative(blueListTmp1));

        ssqBall.sortAll();

        return ssqBall;
    }

    /****
     * 随机获取五注七星彩
     * @param RedList
     * @param BlueList
     * @return
     */
    public static List<QXCBall> getQxcFive(List<BaseBall> RedList, List<BaseBall> BlueList)
    {
        List<QXCBall> ssqBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp = deepCopyList(RedList);
            List<BaseBall> blueListTmp = deepCopyList(BlueList);

            QXCBall dltBall = getQxcOne(redListTmp,blueListTmp);

            ssqBalls.add(dltBall);
        }

        return ssqBalls;
    }

    /****
     * 随机获取一注七星彩
     * @param RedList
     * @param BlueList
     * @return
     */
    public static QXCBall getQxcOne(List<BaseBall> RedList,List<BaseBall> BlueList)
    {
        QXCBall qxcBall = new QXCBall();

        List<BaseBall> redListTmp = deepCopyList(RedList);
        qxcBall.setR1(getRandomBallNative(redListTmp));
        qxcBall.setR2(getRandomBallNative(redListTmp));
        qxcBall.setR3(getRandomBallNative(redListTmp));
        qxcBall.setR4(getRandomBallNative(redListTmp));
        qxcBall.setR5(getRandomBallNative(redListTmp));
        qxcBall.setR6(getRandomBallNative(redListTmp));

        List<BaseBall> blueListTmp1 = deepCopyList(BlueList);
        qxcBall.setB1(getRandomBallNative(blueListTmp1));

        qxcBall.addAll();

        return qxcBall;
    }

    /****
     * 随机获取五注东方六加一
     * @param RedList
     * @param BlueList
     * @return
     */
    public static List<LJYBall> getLjyFive(List<BaseBall> RedList, List<BaseBall> BlueList)
    {
        List<LJYBall> ssqBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp = deepCopyList(RedList);
            List<BaseBall> blueListTmp = deepCopyList(BlueList);

            LJYBall dltBall = getLjyOne(redListTmp,blueListTmp);

            ssqBalls.add(dltBall);
        }

        return ssqBalls;
    }

    /****
     * 随机获取一注东方六加一
     * @param RedList
     * @param BlueList
     * @return
     */
    public static LJYBall getLjyOne(List<BaseBall> RedList, List<BaseBall> BlueList)
    {
        LJYBall ljyBall = new LJYBall();

        List<BaseBall> redListTmp = deepCopyList(RedList);
        ljyBall.setR1(getRandomBallNative(redListTmp));
        ljyBall.setR2(getRandomBallNative(redListTmp));
        ljyBall.setR3(getRandomBallNative(redListTmp));
        ljyBall.setR4(getRandomBallNative(redListTmp));
        ljyBall.setR5(getRandomBallNative(redListTmp));
        ljyBall.setR6(getRandomBallNative(redListTmp));

        List<BaseBall> blueListTmp1 = deepCopyList(BlueList);
        ljyBall.setB1(getRandomBallNative(blueListTmp1));

        ljyBall.addAll();

        return ljyBall;
    }

    /****
     * 随机获取五注七位数
     * @param RedList
     * @return
     */
    public static List<QWSBall> getQwsFive(List<BaseBall> RedList)
    {
        List<QWSBall> ssqBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp = deepCopyList(RedList);

            QWSBall dltBall = getQwsOne(redListTmp);

            ssqBalls.add(dltBall);
        }

        return ssqBalls;
    }

    /****
     * 随机获取一注七位数
     * @param RedList
     * @return
     */
    public static QWSBall getQwsOne(List<BaseBall> RedList)
    {
        QWSBall qwsBall = new QWSBall();

        List<BaseBall> redListTmp = deepCopyList(RedList);
        qwsBall.setR1(getRandomBallNative(redListTmp));
        qwsBall.setR2(getRandomBallNative(redListTmp));
        qwsBall.setR3(getRandomBallNative(redListTmp));
        qwsBall.setR4(getRandomBallNative(redListTmp));
        qwsBall.setR5(getRandomBallNative(redListTmp));
        qwsBall.setR6(getRandomBallNative(redListTmp));
        qwsBall.setR7(getRandomBallNative(redListTmp));

        qwsBall.addAll();

        return qwsBall;
    }

    /****
     * 随机获取五注七位数
     * @param RedList
     * @return
     */
    public static List<QLCBall> getQlcFive(List<BaseBall> RedList)
    {
        List<QLCBall> qlcBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp = deepCopyList(RedList);

            QLCBall dltBall = getQlcOne(redListTmp);

            qlcBalls.add(dltBall);
        }

        return qlcBalls;
    }

    /****
     * 随机获取一注七位数
     * @param RedList
     * @return
     */
    public static QLCBall getQlcOne(List<BaseBall> RedList)
    {
        QLCBall qlcBall = new QLCBall();

        List<BaseBall> redListTmp = deepCopyList(RedList);
        qlcBall.setR1(getRandomBall(redListTmp));
        qlcBall.setR2(getRandomBall(redListTmp));
        qlcBall.setR3(getRandomBall(redListTmp));
        qlcBall.setR4(getRandomBall(redListTmp));
        qlcBall.setR5(getRandomBall(redListTmp));
        qlcBall.setR6(getRandomBall(redListTmp));
        qlcBall.setR7(getRandomBall(redListTmp));

        qlcBall.addAll();

        return qlcBall;
    }

    /****
     * 随机获取五注七位数
     * @param RedList
     * @return
     */
    public static List<PLWBall> getPlwFive(List<BaseBall> RedList)
    {
        List<PLWBall> plwBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp = deepCopyList(RedList);

            PLWBall dltBall = getPlwOne(redListTmp);

            plwBalls.add(dltBall);
        }

        return plwBalls;
    }

    /****
     * 随机获取一注排列五
     * @param RedList
     * @return
     */
    public static PLWBall getPlwOne(List<BaseBall> RedList)
    {
        PLWBall plwBall = new PLWBall();

        List<BaseBall> redListTmp = deepCopyList(RedList);

        plwBall.setR1(getRandomBall(redListTmp));
        plwBall.setR2(getRandomBall(redListTmp));
        plwBall.setR3(getRandomBall(redListTmp));
        plwBall.setR4(getRandomBall(redListTmp));
        plwBall.setR5(getRandomBall(redListTmp));

        plwBall.addAll();

        return plwBall;
    }

    /****
     * 随机获取五注七位数
     * @param RedList
     * @return
     */
    public static List<KLBBall> getKlbFive(List<BaseBall> RedList)
    {
        List<KLBBall> klbBalls = new ArrayList<>();

        for (int i =0 ; i< 5; i++) {

            List<BaseBall> redListTmp = deepCopyList(RedList);

            KLBBall dltBall = getKlbOne(redListTmp);

            klbBalls.add(dltBall);
        }

        return klbBalls;
    }

    /****
     * 随机获取一注排列五
     * @param RedList
     * @return
     */
    public static KLBBall getKlbOne(List<BaseBall> RedList)
    {
        KLBBall klbBall = new KLBBall();

        List<BaseBall> redListTmp = deepCopyList(RedList);

        klbBall.setR1(getRandomBall(redListTmp));
        klbBall.setR2(getRandomBall(redListTmp));
        klbBall.setR3(getRandomBall(redListTmp));
        klbBall.setR4(getRandomBall(redListTmp));
        klbBall.setR5(getRandomBall(redListTmp));
        klbBall.setR6(getRandomBall(redListTmp));
        klbBall.setR7(getRandomBall(redListTmp));
        klbBall.setR8(getRandomBall(redListTmp));

        klbBall.addAll();

        return klbBall;
    }

    /***
     * List列表中取出随机数字
     * @param list
     * @return
     */
    public static BaseBall getRandomBall(List<BaseBall> list)
    {
        Random random = new Random();

        int n = random.nextInt(list.size());

        return list.remove(n);
    }

    /***
     * List列表中获得随机数字
     * @param list
     * @return
     */
    public static BaseBall getRandomBallNative(List<BaseBall> list)
    {
        Random random = new Random();

        int n = random.nextInt(list.size());

        return list.get(n);
    }

    /***
     * 深度复制
     * @param src
     * @param <T>
     * @return
     */
    public static <T> List<T> deepCopyList(List<T> src)
    {
        List<T> dest = null;
        try
        {
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(src);
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            dest = (List<T>) in.readObject();
        }
        catch (IOException e)
        {

        }
        catch (ClassNotFoundException e)
        {

        }
        return dest;
    }

    public static String getDateTimeEs(final Date dateTime) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(dateTime);
    }

    public static int getDayofWeek() {
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        return c.get(Calendar.DAY_OF_WEEK);
    }

    public static String StringData() {
        String mWay = String.valueOf(getDayofWeek());

        if("1".equals(mWay)){
            mWay ="天";
        }else if("2".equals(mWay)){
            mWay ="一";
        }else if("3".equals(mWay)){
            mWay ="二";
        }else if("4".equals(mWay)){
            mWay ="三";
        }else if("5".equals(mWay)){
            mWay ="四";
        }else if("6".equals(mWay)){
            mWay ="五";
        }else if("7".equals(mWay)){
            mWay ="六";
        }
        return "星期"+mWay;
    }
}
