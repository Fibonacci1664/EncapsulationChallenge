package com.davegreen;

/**
 * Created by daveg on 19/06/2017.
 */
public class Printer
{
    private int inkLevel = 100;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int inkLevel, boolean isDuplex)
    {
        if(inkLevel > -1 && inkLevel <= 100)
        {
            this.inkLevel = inkLevel;
        }
        else
        {
            this.inkLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int replaceInk(int inkCartridgeSize)
    {
        if(inkLevel > 0 && inkCartridgeSize <= 100)
        {
            if(this.inkLevel + inkCartridgeSize > 100)
            {
                return -1;
            }
            this.inkLevel += inkCartridgeSize;
            return this.inkLevel;
        }
        else
        {
            return -1;
        }
    }

    public int printPages(int pages)
    {
        int pagesToPrint = pages;
        if(this.isDuplex)
        {
            pagesToPrint /= 2;
            System.out.println("Printer is in duplex mode!");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

//        System.out.println("Printing is about to begin");             // Part of my original challenge code.
//        for(int i = 0; i < 100; i ++)
//        {
//            System.out.println("You have printed " + i + " pages");
//            this.inkLevel -= 3;
//            if(this.inkLevel < 10)
//            {
//                System.out.println("Replacing ink cartridge");
//                replaceInk();
//            }
//        }
//
//        System.out.println("You are out of paper!");
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }
}
