package com.epam.rd.autotasks;

public class CarouselHalfRun extends CarouselRun{

    public CarouselHalfRun(DecrementingCarousel dec) {
        super(dec);
    }

    public int next() {
        int passesNumber = 0;
        int listElement;
        do {
            if(passesNumber > dec.carosel.length) return -1;
            if(runnerIndex == dec.carosel.length) runnerIndex = 0;

            listElement = dec.carosel[runnerIndex];

            runnerIndex++;
            passesNumber++;

        } while (listElement == 0);


        dec.carosel[runnerIndex-1] /= 2;
        //System.out.println("Current = " + listElement + " Current changed - " + dec.carosel[runnerIndex-1]);
        return listElement;
    }
}
