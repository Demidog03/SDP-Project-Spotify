//package com.company.DecoratorPattern.SongGenres;
//
//import com.company.AudioFormats.IFormat;
//import com.company.DecoratorPattern.SongDecorator;
//import com.company.Entities.Song;
//
//import java.util.Collections;
//import java.util.List;
//
//public class Rock extends SongDecorator {
//    public Rock(Song song) {
//        super(song);
//    }
//
//    @Override
//    public String getSongName() {
//        return super.getSongName();
//    }
//
//    @Override
//    public int getPublishedYear() {
//        return super.getPublishedYear();
//    }
//
//    @Override
//    public String getDescription() {
//        return super.getDescription();
//    }
//
//    @Override
//    public List<String> getGenres() {
//        return Collections.singletonList(super.getGenres() + "Rock");
//    }
//
//}
