/* 
 * The MIT License
 *
 * Copyright 2013 Venkat Ram Akkineni.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.netbeans.modules.plantumlnb.pumllexer;

/** Token Manager. */
public class PUMLParserTokenManager implements PUMLParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fffffffffffffc0L) != 0L || (active1 & 0x1fffff800L) != 0L)
         {
            jjmatchedKind = 97;
            return 12;
         }
         return -1;
      case 1:
         if ((active0 & 0x40280001800040L) != 0L)
            return 12;
         if ((active0 & 0x3fbfd7fffe7fff80L) != 0L || (active1 & 0x1fffff800L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 97;
               jjmatchedPos = 1;
            }
            return 12;
         }
         return -1;
      case 2:
         if ((active0 & 0x810c0a008015800L) != 0L || (active1 & 0x1000L) != 0L)
            return 12;
         if ((active0 & 0x37af175ff67ea780L) != 0L || (active1 & 0x1ffffe800L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 97;
               jjmatchedPos = 2;
            }
            return 12;
         }
         return -1;
      case 3:
         if ((active0 & 0x1200141e0628a080L) != 0L || (active1 & 0x1820000L) != 0L)
            return 12;
         if ((active0 & 0x2dafc341f0560700L) != 0L || (active1 & 0x1fe7df800L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 97;
               jjmatchedPos = 3;
            }
            return 12;
         }
         return -1;
      case 4:
         if ((active0 & 0x2500400000520200L) != 0L || (active1 & 0x26084800L) != 0L)
            return 12;
         if ((active0 & 0x8af8349f0040500L) != 0L || (active1 & 0x1d875b000L) != 0L)
         {
            jjmatchedKind = 97;
            jjmatchedPos = 4;
            return 12;
         }
         return -1;
      case 5:
         if ((active0 & 0xaf004080000000L) != 0L || (active1 & 0x100500000L) != 0L)
            return 12;
         if ((active0 & 0x800830970040500L) != 0L || (active1 & 0xd825b000L) != 0L)
         {
            jjmatchedKind = 97;
            jjmatchedPos = 5;
            return 12;
         }
         return -1;
      case 6:
         if ((active0 & 0x800820830040100L) != 0L || (active1 & 0x48259000L) != 0L)
         {
            jjmatchedKind = 97;
            jjmatchedPos = 6;
            return 12;
         }
         if ((active0 & 0x10140000400L) != 0L || (active1 & 0x90002000L) != 0L)
            return 12;
         return -1;
      case 7:
         if ((active0 & 0x800000010040000L) != 0L || (active1 & 0x48210000L) != 0L)
            return 12;
         if ((active0 & 0x820820000100L) != 0L || (active1 & 0x49000L) != 0L)
         {
            jjmatchedKind = 97;
            jjmatchedPos = 7;
            return 12;
         }
         return -1;
      case 8:
         if ((active0 & 0x820800000000L) != 0L || (active1 & 0x48000L) != 0L)
            return 12;
         if ((active0 & 0x20000100L) != 0L || (active1 & 0x1000L) != 0L)
         {
            jjmatchedKind = 97;
            jjmatchedPos = 8;
            return 12;
         }
         return -1;
      case 9:
         if ((active1 & 0x1000L) != 0L)
         {
            jjmatchedKind = 97;
            jjmatchedPos = 9;
            return 12;
         }
         if ((active0 & 0x20000100L) != 0L)
            return 12;
         return -1;
      case 10:
         if ((active1 & 0x1000L) != 0L)
            return 12;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa1_0(0xc000000000000000L, 0x4L);
      case 60:
         return jjMoveStringLiteralDfa1_0(0x0L, 0xbL);
      case 64:
         return jjMoveStringLiteralDfa1_0(0x30L, 0x0L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x20000000100011c0L, 0x20210800L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4000020800L, 0x40000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4000080040000L, 0x84044000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100060000000L, 0x8000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x800400008002000L, 0x100020000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1001000100000000L, 0x2400000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x100000L, 0x0L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x2000200000000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40200000000000L, 0x8000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2208000L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x20000080400L, 0x1000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x5804000L, 0x100000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x850000010000L, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0xb8000000400000L, 0x800000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x300001c00000000L, 0x10080000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0xa000000200L, 0x0L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x80000000000L, 0x2000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x400000000000000L, 0x0L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active1 & 0x1L) != 0L)
         {
            jjmatchedKind = 64;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000000L, active1, 0x2L);
      case 60:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x8L);
      case 62:
         if ((active0 & 0x4000000000000000L) != 0L)
         {
            jjmatchedKind = 62;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x4L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x870000010000L, active1, 0x8001000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x110000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L, active1, 0x800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0xb6000060200420L, active1, 0x800000L);
      case 102:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 12);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 45, 12);
         break;
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000000L, active1, 0x20000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000400000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x202400200L, active1, 0L);
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x3080L, active1, 0x4004000L);
      case 110:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 12);
         return jjMoveStringLiteralDfa2_0(active0, 0x800400008000000L, active1, 0x100028000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100910e100088800L, active1, 0xc1440000L);
      case 112:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 43, 12);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80160000L, active1, 0x2200000L);
      case 115:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(1, 6, 12);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 54, 12);
         return jjMoveStringLiteralDfa2_0(active0, 0x10L, active1, 0x2000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x300000000000000L, active1, 0x10080000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L, active1, 0L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 45:
         if ((active1 & 0x2L) != 0L)
            return jjStopAtPos(2, 65);
         else if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(2, 67);
         break;
      case 62:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(2, 63);
         else if ((active1 & 0x4L) != 0L)
            return jjStopAtPos(2, 66);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x2102000020000000L, active1, 0x2084000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L, active1, 0x800000L);
      case 100:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x800400200000000L, active1, 0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x84020000L, active1, 0x20002000L);
      case 102:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 52, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L, active1, 0L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000400000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x400001800040000L, active1, 0L);
      case 106:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x100000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x400000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L, active1, 0x40000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000002000020L, active1, 0x80000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x201000500108000L, active1, 0x14000000L);
      case 112:
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x80008000000000L, active1, 0L);
      case 114:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1000800000000000L, active1, 0x1000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40002080L, active1, 0x10000L);
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 12);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x28004010080310L, active1, 0x108208800L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x40020000L);
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000400L, active1, 0L);
      case 120:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000080020010L, active1, 0x8000000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L, active1, 0x2000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000020L, active1, 0x400000L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 12);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 12);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 12);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 12);
         else if ((active1 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 88, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x80020000000000L, active1, 0x108000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000400010000000L, active1, 0x100200000L);
      case 107:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 12);
         else if ((active0 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 60, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000200L, active1, 0L);
      case 109:
         if ((active1 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 81, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x2000000L);
      case 110:
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 44, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L, active1, 0x60000000L);
      case 111:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x100L, active1, 0x800L);
      case 112:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 12);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 57, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x400L, active1, 0x40000L);
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000000L, active1, 0x10000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x4000L);
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 12);
         else if ((active1 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 87, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x5804140040000L, active1, 0x80091000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000100000L, active1, 0x4000000L);
      case 119:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, active1);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x80010000000400L, active1, 0x10002000L);
      case 98:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L, active1, 0x8000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x100000L);
      case 100:
         if ((active1 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 90, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x40000000L);
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 12);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 58, 12);
         else if ((active1 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 83, 12);
         else if ((active1 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 89, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x7000000000000L, active1, 0x400000L);
      case 102:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 46, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x200000L);
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000040000L, active1, 0x1000L);
      case 107:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 12);
         break;
      case 110:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 61, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x100L, active1, 0L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L, active1, 0x40000L);
      case 112:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L, active1, 0L);
      case 114:
         if ((active1 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 75, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000040000010L, active1, 0x80018000L);
      case 115:
         if ((active1 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 78, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L, active1, 0L);
      case 116:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 12);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 56, 12);
         else if ((active1 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 93, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x80080a0000000L, active1, 0x100000000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L, active1, 0L);
      case 118:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, active1);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(3, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, active1);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x810000000L, active1, 0x48210000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L, active1, 0x1000L);
      case 101:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(5, 31, 12);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 51, 12);
         break;
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x8000L);
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000400L, active1, 0x10000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000020000000L, active1, 0L);
      case 109:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 38, 12);
         return jjMoveStringLiteralDfa6_0(active0, 0x20L, active1, 0L);
      case 110:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 53, 12);
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x40000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x8140000000L, active1, 0x80000000L);
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000L, active1, 0L);
      case 114:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 48, 12);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 49, 12);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 50, 12);
         else if ((active1 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 86, 12);
         break;
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x2000L);
      case 116:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 55, 12);
         else if ((active1 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 84, 12);
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000010L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L, active1, 0L);
      case 121:
         if ((active1 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 96, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, active1);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(4, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, active1);
      return 6;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000040000L, active1, 0x8000L);
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x210000L);
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 12);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 40, 12);
         else if ((active1 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 77, 12);
         else if ((active1 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 92, 12);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x40000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000000L, active1, 0x1000L);
      case 108:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(6, 5);
         else if ((active1 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(6, 95, 12);
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000000000L, active1, 0L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000L, active1, 0x40000000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x8000000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x10L, active1, 0L);
      case 118:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000L, active1, 0L);
      case 120:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(6, 32, 12);
         break;
      case 121:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(6, 30, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, active1);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(5, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, active1);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x820000000L, active1, 0L);
      case 98:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000100L, active1, 0L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x20000000000L, active1, 0x8000L);
      case 101:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(7, 28, 12);
         else if ((active0 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 59, 12);
         else if ((active1 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(7, 91, 12);
         break;
      case 108:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(7, 18, 12);
         break;
      case 109:
         return jjMoveStringLiteralDfa8_0(active0, 0x10L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x40000L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000000000L, active1, 0L);
      case 112:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x1000L);
      case 116:
         if ((active1 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(7, 80, 12);
         else if ((active1 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(7, 85, 12);
         break;
      case 121:
         if ((active1 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(7, 94, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, active1);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(6, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, active1);
      return 8;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x1000L);
      case 101:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 41, 12);
         else if ((active1 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(8, 79, 12);
         return jjMoveStringLiteralDfa9_0(active0, 0x100L, active1, 0L);
      case 108:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(8, 4);
         break;
      case 109:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(8, 35, 12);
         break;
      case 110:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 47, 12);
         break;
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x8000000000L, active1, 0L);
      case 116:
         if ((active1 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(8, 82, 12);
         return jjMoveStringLiteralDfa9_0(active0, 0x20000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, active1);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(7, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, active1);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(9, 29, 12);
         break;
      case 110:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0x1000L);
      case 114:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(9, 8, 12);
         break;
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x8000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0, active1);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(8, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, active1);
      return 10;
   }
   switch(curChar)
   {
      case 116:
         if ((active1 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(10, 76, 12);
         return jjMoveStringLiteralDfa11_0(active0, 0x8000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0, active1);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(9, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0, 0L);
      return 11;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0, 0L);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0, 0L);
      return 12;
   }
   switch(curChar)
   {
      case 109:
         return jjMoveStringLiteralDfa13_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0, 0L);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0, 0L);
      return 13;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa14_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0, 0L);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0, 0L);
      return 14;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa15_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0, 0L);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0, 0L);
      return 15;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa16_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0, 0L);
}
private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0, 0L);
      return 16;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa17_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0, 0L);
}
private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0, 0L);
      return 17;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa18_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(16, active0, 0L);
}
private int jjMoveStringLiteralDfa18_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0, 0L);
      return 18;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa19_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(17, active0, 0L);
}
private int jjMoveStringLiteralDfa19_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(17, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(18, active0, 0L);
      return 19;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa20_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(18, active0, 0L);
}
private int jjMoveStringLiteralDfa20_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(18, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(19, active0, 0L);
      return 20;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa21_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(19, active0, 0L);
}
private int jjMoveStringLiteralDfa21_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(19, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(20, active0, 0L);
      return 21;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa22_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(20, active0, 0L);
}
private int jjMoveStringLiteralDfa22_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(20, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(21, active0, 0L);
      return 22;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(22, 39);
         break;
      default :
         break;
   }
   return jjStartNfa_0(21, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0xfff0000000200002L, 0xffffffffffffdfffL, 0xfffff00f7fffffffL, 0x12000000007fffffL
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x420043c00000000L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0xffffcffffffffL, 0xffffffffffff0000L, 0xf9ff3fffffffffffL, 0x401f00030003L
};
static final long[] jjbitVec6 = {
   0x0L, 0x400000000000000L, 0xfffffffbffffd740L, 0xffffffcff7fffL
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xfffffffffffff003L, 0x33fffffffff199fL
};
static final long[] jjbitVec8 = {
   0xfffe000000000000L, 0xfffffffe027fffffL, 0xffL, 0x707ffffff0000L
};
static final long[] jjbitVec9 = {
   0x7fffffe00000000L, 0xfffe0000000007ffL, 0xffffffffffffffffL, 0x1c000060002fffffL
};
static final long[] jjbitVec10 = {
   0x1ffffffd0000L, 0x0L, 0x3fffffffffL, 0x0L
};
static final long[] jjbitVec11 = {
   0x23ffffffffffffe0L, 0x3ff010000L, 0x3c5fdfffff99fe0L, 0xf0003b0000000L
};
static final long[] jjbitVec12 = {
   0x36dfdfffff987e0L, 0x1c00005e000000L, 0x23edfdfffffbafe0L, 0x100010000L
};
static final long[] jjbitVec13 = {
   0x23cdfdfffff99fe0L, 0x3b0000000L, 0x3bfc718d63dc7e0L, 0x0L
};
static final long[] jjbitVec14 = {
   0x3effdfffffddfe0L, 0x300000000L, 0x3effdfffffddfe0L, 0x340000000L
};
static final long[] jjbitVec15 = {
   0x3fffdfffffddfe0L, 0x300000000L, 0x2ffbfffffc7fffe0L, 0x7fL
};
static final long[] jjbitVec16 = {
   0x800dfffffffffffeL, 0x7fL, 0x200decaefef02596L, 0x3000005fL
};
static final long[] jjbitVec17 = {
   0x1L, 0x7fffffffeffL, 0xf00L, 0x0L
};
static final long[] jjbitVec18 = {
   0x6fbffffffffL, 0x3f0000L, 0xffffffff00000000L, 0x7fffffffff003fL
};
static final long[] jjbitVec19 = {
   0xffffffffffffffffL, 0xffffffff83ffffffL, 0xffffff07ffffffffL, 0x3ffffffffffffffL
};
static final long[] jjbitVec20 = {
   0xffffffffffffff7fL, 0xffffffff3d7f3d7fL, 0x7f3d7fffffff3d7fL, 0xffff7fffff7f7f3dL
};
static final long[] jjbitVec21 = {
   0xffffffff7f3d7fffL, 0x7ffff7fL, 0xffffffff00000000L, 0x1fffffffffffffL
};
static final long[] jjbitVec22 = {
   0xffffffffffffffffL, 0x7f9fffffffffffL, 0xffffffff07fffffeL, 0x7ffffffffffL
};
static final long[] jjbitVec23 = {
   0x0L, 0x0L, 0xfffffffffffffL, 0x8000000L
};
static final long[] jjbitVec24 = {
   0xffffffff00000000L, 0xffffffffffffffL, 0x1ffffffffffL, 0x0L
};
static final long[] jjbitVec25 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffff0fffffffL, 0x3ffffffffffffffL
};
static final long[] jjbitVec26 = {
   0xffffffff3f3fffffL, 0x3fffffffaaff3f3fL, 0x5fdfffffffffffffL, 0x1fdc1fff0fcf1fdcL
};
static final long[] jjbitVec27 = {
   0x8000000000000000L, 0x8000000000000001L, 0xffff00000000L, 0x0L
};
static final long[] jjbitVec28 = {
   0x3fbbd503e2ffc84L, 0xffffffff00000000L, 0xfL, 0x0L
};
static final long[] jjbitVec29 = {
   0x73e03fe000000e0L, 0xfffffffffffffffeL, 0xfffffffe601fffffL, 0x7fffffffffffffffL
};
static final long[] jjbitVec30 = {
   0xfffe1fffffffffe0L, 0xffffffffffffffffL, 0xffffff00007fffL, 0x0L
};
static final long[] jjbitVec31 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffffffL, 0x0L
};
static final long[] jjbitVec32 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffL, 0x0L
};
static final long[] jjbitVec33 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x1fffL, 0x0L
};
static final long[] jjbitVec34 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xfffffffffL, 0x0L
};
static final long[] jjbitVec35 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec36 = {
   0x5f7ffdffa0f8007fL, 0xffffffffffffffdbL, 0x3ffffffffffffL, 0xfffffffffff80000L
};
static final long[] jjbitVec37 = {
   0x3fffffffffffffffL, 0xffffffffffff0000L, 0xfffffffffffcffffL, 0xfff0000000000ffL
};
static final long[] jjbitVec38 = {
   0x18000000000000L, 0xffd702000000e000L, 0xffffffffffffffffL, 0x1fffffffffffffffL
};
static final long[] jjbitVec39 = {
   0x87fffffe00000010L, 0xffffffe007fffffeL, 0x7fffffffffffffffL, 0x631cfcfcfcL
};
static final long[] jjbitVec40 = {
   0x0L, 0x0L, 0x420043cffffffffL, 0xff7fffffff7fffffL
};
static final long[] jjbitVec41 = {
   0xffffffffffffffffL, 0x400000700007fffL, 0xfffffffbffffd740L, 0xffffffcff7fffL
};
static final long[] jjbitVec42 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xfffffffffffff07bL, 0x33fffffffff199fL
};
static final long[] jjbitVec43 = {
   0xfffe000000000000L, 0xfffffffe027fffffL, 0xbbfffffbfffe00ffL, 0x707ffffff0016L
};
static final long[] jjbitVec44 = {
   0x7fffffe00000000L, 0xffff03ff003fffffL, 0xffffffffffffffffL, 0x1fff3dff9fefffffL
};
static final long[] jjbitVec45 = {
   0xffff1fffffff8000L, 0x7ffL, 0x1ffffffffffffL, 0x0L
};
static final long[] jjbitVec46 = {
   0xf3ffffffffffffeeL, 0xffcfff1f3fffL, 0xd3c5fdfffff99feeL, 0xfffcfb080399fL
};
static final long[] jjbitVec47 = {
   0xd36dfdfffff987e4L, 0x1fffc05e003987L, 0xf3edfdfffffbafeeL, 0xffc100013bbfL
};
static final long[] jjbitVec48 = {
   0xf3cdfdfffff99feeL, 0xffc3b0c0398fL, 0xc3bfc718d63dc7ecL, 0xff8000803dc7L
};
static final long[] jjbitVec49 = {
   0xc3effdfffffddfeeL, 0xffc300603ddfL, 0xc3effdfffffddfecL, 0xffc340603ddfL
};
static final long[] jjbitVec50 = {
   0xc3fffdfffffddfecL, 0xffc300803dcfL, 0x2ffbfffffc7fffecL, 0xc0000ff5f847fL
};
static final long[] jjbitVec51 = {
   0x87fffffffffffffeL, 0x3ff7fffL, 0x3bffecaefef02596L, 0x33ff3f5fL
};
static final long[] jjbitVec52 = {
   0xc2a003ff03000001L, 0xfffe07fffffffeffL, 0x1ffffffffeff0fdfL, 0x40L
};
static final long[] jjbitVec53 = {
   0x3c7f6fbffffffffL, 0x3ff03ffL, 0xffffffff00000000L, 0x7fffffffff003fL
};
static final long[] jjbitVec54 = {
   0xffffffff7f3d7fffL, 0x3fe0007ffff7fL, 0xffffffff00000000L, 0x1fffffffffffffL
};
static final long[] jjbitVec55 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0x3ff080fffffL
};
static final long[] jjbitVec56 = {
   0xffffffff03ff7800L, 0xffffffffffffffL, 0x3ffffffffffL, 0x0L
};
static final long[] jjbitVec57 = {
   0x80007c000000f000L, 0x8000fc0000000001L, 0xffff00000000L, 0x21fff0000L
};
static final long[] jjbitVec58 = {
   0x73efffe000000e0L, 0xfffffffffffffffeL, 0xfffffffe661fffffL, 0x7fffffffffffffffL
};
static final long[] jjbitVec59 = {
   0x5f7ffdffe0f8007fL, 0xffffffffffffffdbL, 0x3ffffffffffffL, 0xfffffffffff80000L
};
static final long[] jjbitVec60 = {
   0x18000f00000000L, 0xffd702000000e000L, 0xffffffffffffffffL, 0x9fffffffffffffffL
};
static final long[] jjbitVec61 = {
   0x87fffffe03ff0010L, 0xffffffe007fffffeL, 0x7fffffffffffffffL, 0xe0000631cfcfcfcL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 42;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x100003600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 97)
                        kind = 97;
                     jjCheckNAdd(12);
                  }
                  else if (curChar == 58)
                  {
                     if (kind > 3)
                        kind = 3;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 39)
                  {
                     if (kind > 2)
                        kind = 2;
                     jjCheckNAddStates(3, 5);
                  }
                  if (curChar == 32)
                     jjCheckNAddStates(6, 18);
                  break;
               case 1:
                  if (curChar != 39)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAddStates(3, 5);
                  break;
               case 2:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAddStates(3, 5);
                  break;
               case 3:
                  if ((0x2400L & l) != 0L && kind > 2)
                     kind = 2;
                  break;
               case 4:
                  if (curChar == 10 && kind > 2)
                     kind = 2;
                  break;
               case 5:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar != 58)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddStates(0, 2);
                  break;
               case 8:
                  if ((0x2400L & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 9:
                  if (curChar == 10 && kind > 3)
                     kind = 3;
                  break;
               case 10:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar != 36)
                     break;
                  if (kind > 97)
                     kind = 97;
                  jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff00100fffc1ffL & l) == 0L)
                     break;
                  if (kind > 97)
                     kind = 97;
                  jjCheckNAdd(12);
                  break;
               case 13:
                  if (curChar == 32)
                     jjCheckNAddStates(6, 18);
                  break;
               case 14:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 15:
                  if (curChar != 32)
                     break;
                  if (kind > 68)
                     kind = 68;
                  jjCheckNAdd(15);
                  break;
               case 16:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 18:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 19:
                  if (curChar != 32)
                     break;
                  if (kind > 69)
                     kind = 69;
                  jjCheckNAdd(19);
                  break;
               case 20:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(20, 24);
                  break;
               case 22:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(22, 23);
                  break;
               case 23:
                  if (curChar != 32)
                     break;
                  if (kind > 70)
                     kind = 70;
                  jjCheckNAdd(23);
                  break;
               case 24:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 25:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(25, 26);
                  break;
               case 26:
                  if (curChar == 42)
                     jjCheckNAdd(27);
                  break;
               case 27:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 28:
                  if (curChar != 32)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjCheckNAdd(28);
                  break;
               case 29:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 30:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
                  if (curChar != 32)
                     break;
                  if (kind > 72)
                     kind = 72;
                  jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 33:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(33, 34);
                  break;
               case 34:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(34, 35);
                  break;
               case 35:
                  if (curChar == 42)
                     jjCheckNAdd(36);
                  break;
               case 36:
                  if (curChar != 32)
                     break;
                  if (kind > 73)
                     kind = 73;
                  jjCheckNAdd(36);
                  break;
               case 37:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 38:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(38, 41);
                  break;
               case 39:
                  if (curChar == 62)
                     jjCheckNAdd(40);
                  break;
               case 40:
                  if (curChar != 32)
                     break;
                  if (kind > 74)
                     kind = 74;
                  jjCheckNAdd(40);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 97)
                     kind = 97;
                  jjCheckNAdd(12);
                  break;
               case 2:
                  if (kind > 2)
                     kind = 2;
                  jjAddStates(3, 5);
                  break;
               case 7:
                  if (kind > 3)
                     kind = 3;
                  jjAddStates(0, 2);
                  break;
               case 12:
                  if ((0x87fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 97)
                     kind = 97;
                  jjCheckNAdd(12);
                  break;
               case 17:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 21:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 31:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 41:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 97)
                     kind = 97;
                  jjCheckNAdd(12);
                  break;
               case 2:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjAddStates(3, 5);
                  break;
               case 7:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjAddStates(0, 2);
                  break;
               case 12:
                  if (!jjCanMove_2(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 97)
                     kind = 97;
                  jjCheckNAdd(12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 42 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   7, 8, 10, 2, 3, 5, 14, 16, 17, 20, 24, 25, 26, 29, 30, 33, 
   34, 37, 38, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 2:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 4:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 5:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 6:
         return ((jjbitVec9[i2] & l2) != 0L);
      case 7:
         return ((jjbitVec10[i2] & l2) != 0L);
      case 9:
         return ((jjbitVec11[i2] & l2) != 0L);
      case 10:
         return ((jjbitVec12[i2] & l2) != 0L);
      case 11:
         return ((jjbitVec13[i2] & l2) != 0L);
      case 12:
         return ((jjbitVec14[i2] & l2) != 0L);
      case 13:
         return ((jjbitVec15[i2] & l2) != 0L);
      case 14:
         return ((jjbitVec16[i2] & l2) != 0L);
      case 15:
         return ((jjbitVec17[i2] & l2) != 0L);
      case 16:
         return ((jjbitVec18[i2] & l2) != 0L);
      case 17:
         return ((jjbitVec19[i2] & l2) != 0L);
      case 18:
         return ((jjbitVec20[i2] & l2) != 0L);
      case 19:
         return ((jjbitVec21[i2] & l2) != 0L);
      case 20:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 22:
         return ((jjbitVec22[i2] & l2) != 0L);
      case 23:
         return ((jjbitVec23[i2] & l2) != 0L);
      case 24:
         return ((jjbitVec24[i2] & l2) != 0L);
      case 30:
         return ((jjbitVec25[i2] & l2) != 0L);
      case 31:
         return ((jjbitVec26[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec27[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec28[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec29[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec30[i2] & l2) != 0L);
      case 77:
         return ((jjbitVec31[i2] & l2) != 0L);
      case 159:
         return ((jjbitVec32[i2] & l2) != 0L);
      case 164:
         return ((jjbitVec33[i2] & l2) != 0L);
      case 215:
         return ((jjbitVec34[i2] & l2) != 0L);
      case 250:
         return ((jjbitVec35[i2] & l2) != 0L);
      case 251:
         return ((jjbitVec36[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec37[i2] & l2) != 0L);
      case 254:
         return ((jjbitVec38[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec39[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec40[i2] & l2) != 0L);
      case 2:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec41[i2] & l2) != 0L);
      case 4:
         return ((jjbitVec42[i2] & l2) != 0L);
      case 5:
         return ((jjbitVec43[i2] & l2) != 0L);
      case 6:
         return ((jjbitVec44[i2] & l2) != 0L);
      case 7:
         return ((jjbitVec45[i2] & l2) != 0L);
      case 9:
         return ((jjbitVec46[i2] & l2) != 0L);
      case 10:
         return ((jjbitVec47[i2] & l2) != 0L);
      case 11:
         return ((jjbitVec48[i2] & l2) != 0L);
      case 12:
         return ((jjbitVec49[i2] & l2) != 0L);
      case 13:
         return ((jjbitVec50[i2] & l2) != 0L);
      case 14:
         return ((jjbitVec51[i2] & l2) != 0L);
      case 15:
         return ((jjbitVec52[i2] & l2) != 0L);
      case 16:
         return ((jjbitVec53[i2] & l2) != 0L);
      case 17:
         return ((jjbitVec19[i2] & l2) != 0L);
      case 18:
         return ((jjbitVec20[i2] & l2) != 0L);
      case 19:
         return ((jjbitVec54[i2] & l2) != 0L);
      case 20:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 22:
         return ((jjbitVec22[i2] & l2) != 0L);
      case 23:
         return ((jjbitVec55[i2] & l2) != 0L);
      case 24:
         return ((jjbitVec56[i2] & l2) != 0L);
      case 30:
         return ((jjbitVec25[i2] & l2) != 0L);
      case 31:
         return ((jjbitVec26[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec57[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec28[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec58[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec30[i2] & l2) != 0L);
      case 77:
         return ((jjbitVec31[i2] & l2) != 0L);
      case 159:
         return ((jjbitVec32[i2] & l2) != 0L);
      case 164:
         return ((jjbitVec33[i2] & l2) != 0L);
      case 215:
         return ((jjbitVec34[i2] & l2) != 0L);
      case 250:
         return ((jjbitVec35[i2] & l2) != 0L);
      case 251:
         return ((jjbitVec59[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec37[i2] & l2) != 0L);
      case 254:
         return ((jjbitVec60[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec61[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\100\163\164\141\162\164\165\155\154", 
"\100\145\156\144\165\155\154", "\141\163", "\141\154\163\157", "\141\165\164\157\156\165\155\142\145\162", 
"\164\151\164\154\145", "\156\145\167\160\141\147\145", "\142\157\170", "\141\154\164", 
"\145\154\163\145", "\157\160\164", "\154\157\157\160", "\160\141\162", "\142\162\145\141\153", 
"\143\162\151\164\151\143\141\154", "\156\157\164\145", "\147\162\157\165\160", "\154\145\146\164", 
"\162\151\147\150\164", "\157\146", "\157\156", "\154\151\156\153", "\157\166\145\162", 
"\145\156\144", "\141\143\164\151\166\141\164\145", 
"\144\145\141\143\164\151\166\141\164\145", "\144\145\163\164\162\157\171", "\143\162\145\141\164\145", 
"\146\157\157\164\142\157\170", "\150\151\144\145", "\163\150\157\167", 
"\163\153\151\156\160\141\162\141\155", "\163\153\151\156", "\164\157\160", "\142\157\164\164\157\155", 
"\164\157\160\40\164\157\40\142\157\164\164\157\155\40\144\151\162\145\143\164\151\157\156", "\160\141\143\153\141\147\145", "\156\141\155\145\163\160\141\143\145", 
"\160\141\147\145", "\165\160", "\144\157\167\156", "\151\146", "\145\156\144\151\146", 
"\160\141\162\164\151\164\151\157\156", "\146\157\157\164\145\162", "\150\145\141\144\145\162", 
"\143\145\156\164\145\162", "\162\157\164\141\164\145", "\162\145\146", "\162\145\164\165\162\156", 
"\151\163", "\162\145\160\145\141\164", "\163\164\141\162\164", "\163\164\157\160", 
"\167\150\151\154\145", "\145\156\144\167\150\151\154\145", "\146\157\162\153", 
"\141\147\141\151\156", "\55\76", "\55\55\76", "\74\55", "\74\55\55", "\55\76\76", "\74\74\55", null, 
null, null, null, null, null, null, "\141\143\164\157\162", 
"\160\141\162\164\151\143\151\160\141\156\164", "\165\163\145\143\141\163\145", "\143\154\141\163\163", 
"\151\156\164\145\162\146\141\143\145", "\141\142\163\164\162\141\143\164", "\145\156\165\155", 
"\143\157\155\160\157\156\145\156\164", "\163\164\141\164\145", "\157\142\152\145\143\164", 
"\141\162\164\151\146\141\143\164", "\146\157\154\144\145\162", "\162\145\143\164", "\156\157\144\145", 
"\146\162\141\155\145", "\143\154\157\165\144", "\144\141\164\141\142\141\163\145", 
"\163\164\157\162\141\147\145", "\141\147\145\156\164", "\142\157\165\156\144\141\162\171", 
"\143\157\156\164\162\157\154", "\145\156\164\151\164\171", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffffffL, 0x3ffffffffL, 
};
static final long[] jjtoSkip = {
   0x0L, 0x1000000000L, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[42];
private final int[] jjstateSet = new int[84];
protected char curChar;
/** Constructor. */
public PUMLParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public PUMLParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 42; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 100)
   {
      jjmatchedKind = 100;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
