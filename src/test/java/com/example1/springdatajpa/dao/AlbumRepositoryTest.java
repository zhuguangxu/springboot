package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {

    @Resource
    private AlbumRepository albumRepository;

    @Test
    public void initData(){
        Album[] albums = {
                new Album("https://goo.gl/VLUQEk","读书","不开心的时候多读读书，会释放压力",567),
                new Album("https://goo.gl/vQfBwF","互联网","科技改变生活，互联网的时代，我们要充分利用。比如微信社交电商的商业模式，通过用户的社交渠道进行低成本的裂变传播一直是各个电商平台获取流量和增长的一个重要手段，但社交电商这个概念却是近期才被广泛提及。",456),
                new Album("https://goo.gl/beB4Lg","旅行-在路上","古北水镇：白天是雄浑温柔的水乡，晚上似光华灿烂火中起舞的凤凰。古老的汤河蜿蜒从镇子中央穿过，古建筑依水而建，小桥流水，柔柳拂面。",199),
                new Album("https://goo.gl/9jHxPz","观影","最悲情的赌片《至尊无上2》，大反派英年早逝，小女孩退出演艺圈",567),
                new Album("https://goo.gl/hVgZpV","手绘","手绘作品",387),
                new Album("https://goo.gl/EhY7re","摄影","美好的一天从大鸟原创手机壁纸开始。 点击图片，长按保存，设为壁纸。 设置壁纸时，可以手动调整一下图片，以匹配自己的屏幕大小哦",86),

        };
        for(int i=0;i<albums.length;i++){
            albumRepository.save(albums[i]);
        }
    }
    @Test
    public void findhotAlbums() {

    }
}