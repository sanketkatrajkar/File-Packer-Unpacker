import MarvellousPackerUnpacker.MarvellousPacker;

import java.util.*;
import java.io.*;

class Packer
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Directory that you want to pack : ");
            String DirName = sobj.nextLine();

            System.out.println("Enter the name of file that you want to create for packing : ");
            String PackName = sobj.nextLine();

            MarvellousPacker mobj = new MarvellousPacker(PackName, DirName);

            mobj.PackingActivity();
        }
        catch(Exception eobj)
        {}
    } // End of main
} // End of program467 class