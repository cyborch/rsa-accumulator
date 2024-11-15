package org.starcoin.rsa;

import java.util.Random;
import org.junit.Test;
import org.junit.Assert;

import java.math.BigInteger;

public class RSAJavaTest {

    @Test
    public void testRSAAccumulator() {
        RSAAccumulator accumulator = new RSAAccumulator();
        byte[] bytes = new byte[120];
        new Random().nextBytes(bytes);
        BigInteger x0 = new BigInteger(bytes);
        BigInteger commit1 = accumulator.add(x0);
        TwoValue<BigInteger> proof0 = accumulator.proveMembership(x0);

        Assert.assertEquals(accumulator.getSize(), 1);
        Assert.assertEquals(accumulator.getA0(), proof0.getFirst());
        Assert.assertTrue(RSAAccumulator.verifyMembership(commit1, proof0));
    }
}
