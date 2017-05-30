package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by earthchen on 17-5-30.
 */
public interface SpittleRepository {

    /**
     * @param max   返回的Spittle中， Spittle ID属性的最大值
     * @param count 表明要返回多少个Spittle对象
     * @return
     */
    List<Spittle> findSpittles(long max, int count);

    List<Spittle> findRecentSpittles();

    Spittle findOne(long id);

    void save(Spittle spittle);
}
