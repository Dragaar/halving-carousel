package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);

    }

    public CarouselRun run(){
        if(isCaruselRynUnique) {
            CarouselRun rynner = new CarouselHalfRun(this);
            isCaruselRynUnique = false;
            return rynner;
        } else return null;
    }
}
