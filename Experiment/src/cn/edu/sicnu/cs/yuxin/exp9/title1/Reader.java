package cn.edu.sicnu.cs.yuxin.exp9.title1;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        //final String FILENAME = "/home/minecraft/文档/java/Experiment/src/cn/edu/sicnu/cs/yuxin/exp9/title1/contents/斗破苍穹之无上巅峰.txt";
        final String text = "斗破苍穹之无上巅峰\n" +
                "　　作者：干将\n" +
                "\n" +
                "　　第一章飞升\n" +
                "　　萧炎，斗气大陆上的癫峰存在，他的名字无人不知无人不晓。\n" +
                "　　当他达到斗帝的时候，许多都为之高兴，然而，他自己却整天闷闷不乐无精打采，事情的源由有很多，后文待述！\n" +
                "　　术行大陆，萧炎再次穿越，他的斗技斗气在这里只能算是生活用品，而真正称霸这个大陆的是‘术’，这个大陆上的斗帝数不胜数，所以，空中网小说原创频道独家更新只要是斗帝等级的人都会被别人嘲笑的称为斗低。\n" +
                "　　术行大陆的等级划分，从弱至强依次是：武修、锻体、通神、聚形、轮回、三清、虚无、至尊、无上…\n" +
                "　　各个等级之间也会有强弱，所以每个等级分三期，分别是：开期、固期、破期。每期之间都明确的分明了术能的强弱，拥有术的人会被称为术者，而且术者会有属性的划分，比如土术，火术，水术，光术，兽术。有各种属性的术，就可以借用天地间相应的术能来强化自己的身体，借用它们发挥强大的术招。\n" +
                "　　上述所说的术只是普遍最初级的术，因为术会发生质的变化，比如，水术会渐渐强化成冰术，从而增加它的杀伤力与实质性，土术会进化成风术岩术，火术会变成炎术，光术又有圣光术和魔光术，兽术有兽体和兽宠。\n" +
                "　　当然，不会每个术者的术都会发生质的变化，这都要靠实力与运气，有的人是天生就是特殊质体的术，有的人是后天修炼形成的术，总之，要想称霸术行大陆，你的术就必须强大，你的术技就必须精通。还有的人拥有特殊空中网小说原创频道独家更新形式的术，他们跟属性不能相结合，他们的术是天地间强悍稀少的一种能量，一般情况下很少能见到这种人，而且这种人也是大势力最为抢手想得到的王牌。\n" +
                "　　拥有术的人是术者，术者有着一个术体，术体就是与外界术能量的联系主导，如果想联系得更快更强，就得有特殊的诱术技能，但这种术技是可遇而不可求，当然，还有一种更好的方法，就是术灵。\n" +
                "　　术灵，顾名思议是天地间的灵体，他是有生命的，术者必须找到对应的术灵与它达成共识，然后与术灵相互融合吸收，如果没有达成共识，术者轻则重伤，重则就会被术灵控制变成灵控体。术灵等于一个纯真的术体，它会比普通术体吸收运术更轻松更快更强。术灵也有质的不同，如水术灵含毒，那么融合它的人发术招时便也会有毒，但是，有毒的术灵通常都会侵噬术者，所以一般情况下没人会去融合它。\n" +
                "　　因为有术的不同，所以日久天长就会形成几个阵营，这些阵营明争暗斗，不过总体上不会互相侵犯，保持和平。\n" +
                "　　术行大陆，以术为尊，称霸世界，无上永存…\n" +
                "　　夜，很静，萧炎蹑手蹑脚的从薰儿的房间走出。天空的星星闪耀着动人的光芒，一轮洁月洒下柔光，为地面铺上银装。看着四处的房门，萧炎感到很欣慰，她们，都是与自己密切相关的女人，伴随着他走过了风风雨雨，为自己付出，为自己而努力。\n" +
                "　　如今，大家都欢聚一堂，她们都爱自己，她们都互相理解，没有她们，我萧炎也不会走到今天。打败魂殿，重振萧族，萧炎吃了很多苦，但为他分担苦痛的全是这些人。\n" +
                "　　斗帝，多少人为之疯狂！在其他人眼中这就是第一，可萧炎不愿当这第一，因为第一就是距离，第一就代表着离别。一滴眼泪缓缓滑落，滑过脸颊，顺过下巴，有点冰凉，有点辛酸。往日坚强的青年，现在又为何伤悲呢？\n" +
                "　　萧炎的脑海里回忆起前几日修炼时出现的画面…“萧炎，萧炎…”苍老浑厚而又无法抵抗的声音若有若无的出现在萧炎的耳旁。正在修炼的萧炎顿时大惊，闭目感应了一下后更是惊叹，要知道这个帝虚空间可是自己使用斗帝之力开辟出来的，一般人跟本无法进入，就算是进来了萧炎也会马上感应到。可是现在居然有人对自己说话，而且自己丝毫感应不到对方的存在，斗帝可是最颠峰，怎么会有人比自己强？\n" +
                "　　不过萧炎是个自知之明的人，对方既然是强者，自己就不能有失礼貌“前辈好，我是萧炎，请问您找我有何事？”“哈哈哈…算你识相，不像有些人那样以为自己强于别人就霸道傲慢，真是不知道人外有人天外有天！”听到萧炎礼貌的回答，那人似很高兴道。\n" +
                "　　强者，太强大了，随便笑几声就感到有一股强大威压，看来真是天外有天啊，萧炎暗暗惊讶！“多谢前辈夸奖，请问前辈找我有什么事，说与小子我听听！”\n" +
                "　　“好吧，我也不能多待，转入正题。我是虚空传送者，这次来的目的就是向你通知，快准备几日，等待传送到另一个大陆。”苍老的声音让萧炎感到莫名其妙，“我在这呆得好好的为什么穿越啊？”…停顿一会后“这里不是你该呆的地方，斗气大陆是不能长时间承受斗帝强者的力量的，一但斗气大陆承受不住，整个大陆会动荡起来，而你会被虚空乱流所绞杀。当然，不光是这些，血脉必须是斗帝才能传承的，但是如果长时间后代没有再有人达到斗帝，那么你们萧族会再次荒。不过除了这个，还有一个更好的办法，就是你穿越到另一个大陆，成为那个大陆的强者，你的血脉就会延长传承。如果你成为那个大陆的顶峰，你的传承血脉就会永存不息，今后你们萧族就会是最强的。”\n" +
                "　　一口气说了这么多，对方的呼吸依然平缓，萧炎听到对方的解释，有点心动了，实力是他想拥有的，但心爱的人更是他想要的。“如果我去了另一个大陆，那么我的亲人们呢？”\n" +
                "　　“她们只能呆在斗气大陆，就算她们和你一起去了另一个大陆，也会因那里能量过足而爆体。”苍老的声音让萧炎有种绝望的感觉，去也不是留也不是，处在中立的地方真是进退两难。\n" +
                "　　那声音好像对萧炎特别满意，“小子，我佩服你，其他的人一听到要传送到另一个大陆马上便忘了自己的家人，你的这份亲情是别人所缺少的！不过，你必须得离开，因为这密切联系着你的身世。还有，如果你达到一定的程度，是可以回来看望她们的，如果她们其中有人达到斗帝，我也会将其传送到你所在的大陆，与你团聚，你何乐而不为呢？”“什么，身世？”虚空传送者的话更让萧炎奇怪了，马上盯着对方，希望对方把事情说明白。“呵呵，一时居然说漏嘴了，不过跟你说一点也不会有什么大事。”虚空传送这干咳几声，望了望萧炎道“你本不属于斗气大陆，而是来自于一个名叫地球的地方，当然也是我把你传送过来的。至于为什么把你传送到斗气大陆，是因为你的身份特殊，而你这次去另一个大陆是肩负着使命的，使命我不能跟你说，只要你能达到顶峰，到时候你自会明白。”\n" +
                "　　地球，萧炎的脑海里出现了一幅美丽的画面，蓝色的星球，一个类似雄鸡的版块，黑头发黑眼睛，黄色的皮肤，自己真正的家，勾起了萧炎沉封已久的回意。特殊的身份，肩负着使命，到底是什么？\n" +
                "　　萧炎把疑惑的目光投向虚空传送者，可看着对方打死也不说的表情，只好无耐的摇了摇头。“不要问为什么，颠峰是你现在所要追求了，废话少说，我还要去通知其他的人。这是虚空传送简，如果想通了三日后捏爆它，它便会把你带到虚空传送阵旁。”\n" +
                "　　说完便丢下一个通绿冰凉的玉简“自己想清楚，朝目标去奋斗…”声音越来越远，渐渐消失在萧炎的耳旁。\n" +
                "　　想到这里，萧炎从纳戒中拿出玉简，一股清凉袭上全身，用灵魂扫识一下，居然不能探索出它的一点构造。\n" +
                "　　“这是什么，天都这么黑了，怎么还不睡？”一缕幽香拂过萧炎的鼻尖，萧炎感觉到一具温暖柔和的身体正慢慢抱紧他，转过身去，只见一张美丽伊人倾国倾城的脸庞正睁着水灵灵的眼睛望着自己。\n" +
                "　　“薰儿…”萧炎心酸的抱紧身前的美人儿，“萧炎哥哥，你这是怎么了？”看到萧炎这个样子，薰儿似乎觉察到什么，萧炎知道隐瞒不会有好的结果，长痛不如短痛“薰儿，我要离开了……”\n" +
                "　　“什么…？”听到萧炎把事情的源由说完，薰儿顿时感到头部有种斯裂的痛。“砰…砰…”“萧炎，…萧炎…”正在这时，周围的房门全被撞开，一道道美丽的倩影飞出，全都冲过来紧紧抱住萧炎，像个小女生一样都哭泣起来。\n" +
                "　　……许久，薰儿擦掉眼旁的泪水“萧炎哥哥，你想去便去吧，你要朝自己的理想去奋斗，以后我们不是还有机会见面吗，我们都等着你…”说完后又紧紧的抱着的萧炎。\n" +
                "　　见自己最心爱的人理解自己的想法，萧炎很欣慰“好了，我只是暂时离开一段时间。明天向天下所有人通知，我要飞升…”整个帝虚界因为这句话而猛的抖动了几下。\n" +
                "　　“出了什么事…”所有的帝虚界居民都觉得有大事要发生…\n";
        //主视图
        JFrame mainframe = new JFrame("Reader");
        mainframe.setVisible(true);
        mainframe.setSize(800, 500);
        mainframe.setBackground(Color.white);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //容器
        Container container = mainframe.getContentPane();       //创建容器到mainframe
        container.setLayout(null);

        //统计字数按钮
        JButton countWords = new JButton();
        countWords.setBounds(mainframe.getSize().width - 190, 10, 170, 50);
        countWords.setText("统计字数");
        countWords.setFont(new Font("宋体", Font.BOLD, 20));
        //container.add(countWords);
        mainframe.add(countWords);

        //文本域
        JTextArea textArea = new JTextArea();                   //创建文本域
        textArea.setBounds(10, countWords.getBounds().y, countWords.getBounds().x - 30, mainframe.getSize().height - 120);   //设置控件位置，大小
        textArea.setOpaque(true);                               //设置不透明
        textArea.setLineWrap(true);                             //设置自动换行
        textArea.setWrapStyleWord(true);
        textArea.setText(text);
        textArea.setFont(new Font("宋体", Font.BOLD, 16));
        //container.add(textArea);                                //添加到容器
        mainframe.add(textArea);

        //标记位置按钮
        JButton markPosition = new JButton();
        markPosition.setBounds(countWords.getBounds().x, countWords.getBounds().y + countWords.getBounds().height + 10, countWords.getBounds().width, countWords.getBounds().height);
        markPosition.setText("标记位置");
        markPosition.setFont(new Font("宋体", Font.BOLD, 20));
        //container.add(markPosition);
        mainframe.add(markPosition);

        //章节下拉框
        JComboBox<String> chapterComboBox = new JComboBox<String>();
        chapterComboBox.setBounds(countWords.getBounds().x, markPosition.getBounds().y + 200, countWords.getBounds().width, countWords.getBounds().height);
        chapterComboBox.addItem("第一章");
        chapterComboBox.addItem("第二章");
        chapterComboBox.addItem("第三章");
        chapterComboBox.setFont(new Font("宋体", Font.BOLD, 20));
        //container.add(chapterComboBox);
        mainframe.add(chapterComboBox);

        //跳转按钮
        JButton jump = new JButton();
        jump.setBounds(countWords.getBounds().x, chapterComboBox.getBounds().y + chapterComboBox.getBounds().height + 10, countWords.getBounds().width, countWords.getBounds().height);
        jump.setText("跳转");
        jump.setFont(new Font("宋体", Font.BOLD, 20));
        //container.add(jump);
        mainframe.add(jump);

        //搜索提示label
        JLabel show = new JLabel();
        show.setBounds(10, 700, 160, countWords.getBounds().height);
        show.setText("要查找的文字：");
        show.setFont(new Font("宋体", Font.BOLD, 20));
        mainframe.add(show);

        //搜索框
        JTextField textField = new JTextField();
        textField.setBounds(show.getBounds().width + 10, 700, 200, countWords.getBounds().height);
        textField.setFont(new Font("宋体", Font.BOLD, 20));
        mainframe.add(textField);

        //搜索按钮
        JButton search = new JButton();
        search.setBounds(textField.getBounds().x + textField.getBounds().width + 10, 700, countWords.getBounds().width, countWords.getBounds().height);
        search.setText("查找");
        search.setFont(new Font("宋体", Font.BOLD, 20));
        mainframe.add(search);

        while (true) {
            textArea.setSize(countWords.getBounds().x - 30, mainframe.getSize().height - 120);
            countWords.setLocation(mainframe.getSize().width - 190, 10);
            markPosition.setLocation(countWords.getBounds().x, countWords.getBounds().y + countWords.getBounds().height + 10);
            chapterComboBox.setLocation(countWords.getBounds().x, markPosition.getBounds().y + 200);
            jump.setLocation(countWords.getBounds().x, chapterComboBox.getBounds().y + chapterComboBox.getBounds().height + 10);
            show.setLocation(10, mainframe.getSize().height - 100);
            textField.setLocation(show.getBounds().width + 10, show.getBounds().y);
            search.setLocation(textField.getBounds().x + textField.getBounds().width + 10, show.getBounds().y);
        }
    }
}
