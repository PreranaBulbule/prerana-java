package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Novel;
import com.xworkz.Interface.Internal.HardcoverNovelPackagerImpl;

public class NovelRunner {
    public static void main(String[] args) {
        HardcoverNovelPackagerImpl packager = new HardcoverNovelPackagerImpl();
        Novel novel = new Novel(packager);
        novel.startPackaging();
    }
}
