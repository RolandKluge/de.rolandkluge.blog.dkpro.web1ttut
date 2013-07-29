package de.rolandkluge.blog.dkpro.web1ttut;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.googlecode.jweb1t.JWeb1TSearcher;

/**
 *
 * @author Roland Kluge
 */
public class Web1TTut
{
    public static void main(final String[] args)
    {
        /*
         * Set environment variable DKPRO_HOME in your Launch Configuration
         */
        final String dkproHome = System.getenv("DKPRO_HOME");

        try {

            final JWeb1TSearcher web1TSearcher = new JWeb1TSearcher(new File(dkproHome, "web1t/ENGLISH"), 1, 3);

            for (final String phrase : Arrays.asList("house", "like you", "What a wonderful"))
            {
                final long count = web1TSearcher.getFrequency(phrase);
                System.out.println(String.format("Count for '%s': %s", phrase, count));
            }

        }
        catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
