import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class br implements bd, ex, go {
   private boolean d = false;
   public static long a = -1L;
   public static long b = -1L;
   public static long c = 0L;
   public static String a = "";
   public static String b = "";
   public static String c = "";
   public Image a;
   public bn a;
   public Image b;
   public Image c;
   public static Image d;
   public static bv a;
   public static bw a;
   public static int a;
   public static cd a;
   public static int b;
   public static int c;
   public static int d = 100;
   public static int e = 100;
   public static boolean a;
   public static int f;
   public static int g;
   private static int h;
   private static int i;
   public static boolean b;
   public long d;
   public long e;
   public boolean c;
   public String d;

   public br() {
      a = new bv(this);
      a = new bw();
      br var1 = this;

      try {
         var1.a = Image.createImage("/pet/Gem.png");
         d = Image.createImage("/pet/arrow2.png");
         var1.b = Image.createImage("/pet/tiemnang.png");
         var1.c = Image.createImage("/pet/level.png");
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      fl.b = new String[]{"(ngoc)", "(dau)", "(thoc)", "(vang)", "(str)", "(agi)", "(int)", "(atk)", "(def)", "(hp)", "(mp)", "(water)", "(thunder)", "(rock)", "(fire)", "(dark)", "(tree)", "(light)", "(sao)", "(chien)", "(bthu)", "(codo)", "(coxanh)", "(nha)", "(nguoi)", "(saoden)", "(chienluc)", "(nluong)", "(diem)"};

      try {
         fl.a = Image.createImage("/pet/icons.png");
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      cd var4;
      (var4 = a = new cd()).a = bw.a("/pet/battle/SlashEffect");
      var4.a = bw.a("/pet/battle/gong")[0];
      var4.b = bw.a("/pet/battle/attackEffect")[0];
   }

   private static void a(int var0, int var1, int var2, int var3) {
      d = var1;
      e = var3;
      bn var4 = ((bq)eg.a).a;
      if (var0 != b) {
         a = true;
         f = b;
         h = var0;
         if (var4 != null) {
            var4.a(String.valueOf(var0 - b), 0, System.currentTimeMillis() + 100L);
         }
      }

      if (var2 != c) {
         a = true;
         g = c;
         i = var2;
         if (var4 != null) {
            var4.a(String.valueOf(var2 - c), 1, System.currentTimeMillis() + 600L);
         }
      }

   }

   private static void a(long var0, long var2) {
      a = var0;
      a = au.a(var0);
      b = var2;
      b = au.a(var2);
   }

   public static void a(String var0, int var1, int var2, int var3) {
      String var4 = null;
      switch(var1) {
      case 0:
      case 3:
         var4 = "(str) ";
         break;
      case 1:
      case 4:
         var4 = "(agi) ";
         break;
      case 2:
      case 5:
         var4 = "(int) ";
      }

      v.c().a(bc.a, var4 + var0, var2, 22, 17);
   }

   public final void a(ez var1) {
      try {
         switch(var1.a) {
         case 81:
            byte var2;
            bx var3;
            int var4;
            int var5;
            int var6;
            int var7;
            fs var10;
            int var12;
            int var14;
            int var15;
            int var64;
            String var84;
            int var86;
            int var88;
            String[] var94;
            String var95;
            byte var97;
            String var99;
            String var103;
            bg var104;
            int var108;
            ce var112;
            int var120;
            ce var126;
            bq var129;
            int var145;
            bx var149;
            dd var151;
            switch(var1.a().readByte()) {
            case 3:
               var86 = var1.a().readInt();
               var7 = var1.a().readInt();
               ds var123;
               if ((var123 = eg.a.a.a(var86)) != null) {
                  (var129 = (bq)var123).a(var7);
                  return;
               }
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 20:
            case 23:
            case 24:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 38:
            case 43:
            case 44:
            case 45:
            case 46:
            case 51:
            case 52:
            case 54:
            case 55:
            case 58:
            case 60:
            case 62:
            case 68:
            case 77:
            case 78:
            case 85:
            case 87:
            case 89:
            case 96:
            case 97:
            case 99:
            default:
               break;
            case 8:
               var2 = var1.a().readByte();

               for(var7 = 0; var7 < var2; ++var7) {
                  var108 = var1.a().readInt();
                  var120 = var1.a().readInt();
                  String var150 = var1.a().readUTF();
                  String var138 = var1.a().readUTF();
                  var12 = var1.a().readInt();
                  ds var141;
                  if ((var141 = eg.a.a.a(var108)) == null) {
                     return;
                  }

                  bq var152 = (bq)var141;
                  bn var153;
                  (var153 = new bn(var152, var120, var150)).c = var12;
                  var153.d = var138;
                  var152.a(var153);
                  if (var108 == eg.a.a) {
                     if (this.a != null) {
                        int var165 = this.a.b;
                        var165 = var153.b;
                     }

                     this.a = var153;
                  }
               }

               return;
            case 9:
               var2 = var1.a().readByte();
               var95 = var1.a().readUTF();
               byte[] var122;
               if ((var122 = en.a(var1)) != null) {
                  switch(var2) {
                  case 1:
                     a.a(var95, var122);
                     break;
                  case 2:
                     a.b(var95, var122);
                     return;
                  default:
                     return;
                  }
               }
               break;
            case 11:
               var86 = var1.a().readInt();
               (var112 = new ce()).a = var1.a().readInt();
               var112.b = var1.a().readByte();
               var112.a = var1.a().readUTF();
               var112.b = var1.a().readUTF();
               var112.a = var1.a().readByte();
               var112.b = var1.a().readInt();
               var112.a = var1.a().readLong();
               var112.b = var1.a().readLong();
               var112.c = var1.a().readLong();
               var112.c = var1.a().readInt();
               var112.d = var1.a().readInt();
               var112.e = var1.a().readInt();
               var112.f = var1.a().readInt();
               var112.g = var1.a().readInt();
               var112.h = var1.a().readInt();
               var112.i = var1.a().readInt();
               var112.j = var1.a().readInt();
               var112.k = var1.a().readInt();
               var97 = var1.a().readByte();
               var112.a = new String[var97];
               var112.b = new String[var97];
               var112.a = new int[var97];
               var112.b = new int[var97];

               for(var5 = 0; var5 < var97; ++var5) {
                  var112.a[var5] = var1.a().readInt();
                  var112.a[var5] = var1.a().readUTF();
                  var112.b[var5] = var1.a().readUTF();
                  var112.b[var5] = var1.a().readInt();
               }

               var112.l = var1.a().readInt();
               var112.c = new String[var1.a().readInt()];

               for(var5 = 0; var5 < var112.c.length; ++var5) {
                  var1.a().readInt();
                  var112.c[var5] = var1.a().readUTF();
                  var1.a().readByte();
                  var1.a().readUTF();
               }

               if (a == 0) {
                  df var144;
                  (var144 = new df(this, var86 == eg.a.a)).a(var112);
                  var144.a(1, true);
                  return;
               } else {
                  if (bc.a instanceof ag) {
                     ((ag)bc.a).a((fs)null);
                     ((dd)bc.a).a(var112);
                  } else {
                     (var151 = new dd(this, 1)).a(var112);
                     var151.a(2, true);
                  }

                  return;
               }
            case 16:
               var149 = (bx)eg.a;
               var86 = var1.a().readInt();
               if ((var104 = var149.a(var86)) != null) {
                  var104.a(var1, var86 == eg.a.a);
                  return;
               }
               break;
            case 17:
               ((bx)eg.a).a(var1);
               return;
            case 18:
               var1.a().readInt();
               var1.a().readInt();
               var88 = var1.a().readInt();
               ba var118;
               (var118 = new ba()).a();
               fs.e.addElement(var118);
               ++this.a.c;
               j.a_("Chúc mừng! Pet của bạn đã đạt cấp " + var88);
               return;
            case 19:
               if (bc.a instanceof dd) {
                  ((dd)bc.a).a(var1);
                  return;
               }
               break;
            case 21:
               (var112 = new ce()).a = var1.a().readInt();
               var112.a = var1.a().readUTF();
               var112.b = var1.a().readUTF();
               var112.a = var1.a().readByte();
               var112.b = var1.a().readInt();
               var112.a = var1.a().readLong();
               var112.b = var1.a().readLong();
               var112.c = var1.a().readLong();
               var112.c = var1.a().readInt();
               var112.d = var1.a().readInt();
               var112.e = var1.a().readInt();
               var112.l = var1.a().readByte();
               int[] var139 = new int[3];
               int[] var148 = new int[3];
               byte[] var135 = new byte[3];
               String[] var142 = new String[3];
               byte[] var113 = new byte[3];

               for(var14 = 0; var14 < 3; ++var14) {
                  var139[var14] = var1.a().readInt();
                  var148[var14] = var1.a().readInt();
                  var135[var14] = var1.a().readByte();
                  var142[var14] = var1.a().readUTF();
                  var113[var14] = var1.a().readByte();
               }

               (var151 = new dd(this, 0)).a(var112, var139, var148, var135, var142, var113);
               var151.a(1, true);
               return;
            case 22:
            case 41:
               var88 = var1.a().readInt();

               for(var4 = 0; var4 < var88; ++var4) {
                  var5 = var1.a().readInt();
                  var99 = var1.a().readUTF();
                  var103 = var1.a().readUTF();
                  var108 = var1.a().readInt();
                  var120 = var1.a().readInt();
                  var145 = var1.a().readInt();
                  var2 = var1.a().readByte();
                  bp var134 = new bp(var5, var99, var103, var108, var120, var145, var2);
                  ((bx)eg.a).a.addElement(var134);
                  eg.a.a((dz)var134);
                  eg.a.c(var134);
                  var134.a = new gq(0, "Đánh", var134, this);
               }

               return;
            case 25:
               var1.a().readInt();
               long var136 = var1.a().readLong();
               long var130 = var1.a().readLong();
               if (this.d && !b) {
                  ax var109 = new ax();
                  var14 = bc.d;
                  var15 = bc.e;
                  if (eg.a != null && eg.a != null) {
                     var14 = eg.a.m - eg.a.a.b;
                     var15 = eg.a.n - eg.a.b.b - 54 - 2;
                  }

                  var109.a(this, var14, var15, var136 - a, var130 - b);
                  fs.e.addElement(var109);
               }

               a(var136, var130);
               this.d = true;
               return;
            case 26:
               return;
            case 28:
               var108 = var1.a().readInt();
               (var126 = new ce()).a = var1.a().readInt();
               var126.a = var1.a().readUTF();
               var126.b = var1.a().readUTF();
               var126.b = var1.a().readInt();
               var126.c = var1.a().readInt();
               var126.d = var1.a().readInt();
               var126.e = var1.a().readInt();
               cx[] var128 = new cx[var145 = var1.a().readInt()];

               for(var12 = 0; var12 < var145; ++var12) {
                  var128[var12] = new cx();
                  var128[var12].a = var1.a().readInt();
                  var128[var12].b = var1.a().readUTF();
                  var128[var12].a = var1.a().readUTF();
                  var128[var12].c = var1.a().readUTF();
                  var128[var12].b = var1.a().readInt();
                  var128[var12].n = var1.a().readInt();
                  var128[var12].c = var1.a().readInt();
                  var128[var12].d = var1.a().readInt();
                  var128[var12].e = var1.a().readInt();
                  var128[var12].f = var1.a().readInt();
                  var128[var12].g = var1.a().readInt();
                  var128[var12].h = var1.a().readInt();
                  var128[var12].i = var1.a().readInt();
                  var128[var12].j = var1.a().readInt();
                  var128[var12].k = var1.a().readInt();
                  var128[var12].l = var1.a().readInt();
                  var128[var12].m = var1.a().readInt();
                  var128[var12].a = var1.a().readByte();
                  var128[var12].a(var1.a().readByte());
                  if (var1.a().readBoolean()) {
                     long var147 = var1.a().readLong();
                     var128[var12].o = var1.a().readInt();
                     if (var147 > 0L) {
                        var128[var12].c = 2;
                        var128[var12].a = System.currentTimeMillis();
                     } else {
                        var128[var12].c = 1;
                     }

                     System.out.println(var128[var12].o);
                  } else {
                     var128[var12].c = 0;
                  }
               }

               db var140;
               (var140 = new db(this, var108 == eg.a.a)).a(var126, var128);
               var140.a(2, true);
               return;
            case 29:
               if (var1.a().readByte() == 1 && bc.a instanceof db) {
                  ((db)bc.a).a(var1.a().readInt());
                  return;
               }
               break;
            case 36:
               var4 = var1.a().readInt();
               var5 = var1.a().readInt();
               if ((var6 = var1.a().readInt()) == eg.a.a) {
                  fs.e(1);
               }

               ce var106 = b(var1);
               var7 = var1.a().readInt();
               var112 = a(var1);
               var104 = new bg();
               bp var132 = ((bx)eg.a).a(var112.a);
               var104.a = var132;
               var104.a[0] = var6;
               var104.a[1] = var7;
               eg.a.b(var104.a);
               bi var143;
               (var143 = new bi(var104, var104.a.m, var104.a.n, var112, 2)).a = false;
               eg.a.a((dz)var143);
               eg.a.c(var143);
               bi var127;
               (var127 = new bi(var104, var104.a.m + 40, var104.a.n, var106, 0)).a = true;
               eg.a.a((dz)var127);
               eg.a.c(var127);
               bq var133 = (bq)eg.a.a.a(var6);
               var104.b[0] = var133.m;
               var104.c[0] = var133.n;
               var133.m = var104.a.m + 20;
               var133.n = var104.a.n - 20;
               var133.a.f = false;
               var133.a.m = var104.a.m + 40;
               var133.a.n = var104.a.n;
               var104.a[0] = var127;
               var104.a[1] = var143;
               var104.a(var4, var5);
               (var149 = (bx)eg.a).a.put(new Integer(var6), var104);
               if (eg.a.a == var6) {
                  var149.s();
                  var149.m();
                  eg.a.b = false;
                  b = true;
               }

               return;
            case 37:
               (var149 = (bx)eg.a).a = -1;
               var149.b = -1;
               var86 = var1.a().readInt();
               if ((var104 = var149.a(var86)) != null) {
                  var104.a(var1);
                  return;
               }
               break;
            case 39:
               if (var1.a().readByte() == 1 && bc.a instanceof db) {
                  ((db)bc.a).b(var1.a().readInt());
                  return;
               }
               break;
            case 40:
               var4 = var1.a().readInt();
               var5 = var1.a().readInt();
               var6 = var1.a().readInt();
               var7 = var1.a().readInt();
               a(var4, var6, var5, var7);
               return;
            case 42:
               var88 = var1.a().readInt();
               Vector var105 = ((bx)eg.a).a;

               for(var5 = 0; var5 < var105.size(); ++var5) {
                  bp var114;
                  if ((var114 = (bp)var105.elementAt(var5)).a == var88) {
                     var105.removeElement(var114);
                     eg.a.b(var114);
                     return;
                  }
               }

               return;
            case 47:
               if ((var10 = bc.a) instanceof db) {
                  ((db)var10).a(var1);
                  return;
               }
               break;
            case 48:
            case 49:
               if ((var10 = bc.a) instanceof db) {
                  ((db)var10).b(var1);
                  return;
               }
               break;
            case 50:
               int var124 = var1.a().readInt();
               var12 = var1.a().readInt();
               String var137 = var1.a().readUTF();
               String var146 = var1.a().readUTF();
               var15 = var1.a().readInt();
               if ((var10 = bc.a) instanceof df) {
                  ((df)var10).a(var124, var12, var137, var146, var15);
                  return;
               }
               break;
            case 53:
               var84 = var1.a().readUTF();
               if (eg.a != null && (var129 = (bq)eg.a).a != null) {
                  var129.a.a(var84, 3, System.currentTimeMillis() + 1000L);
                  return;
               }
               break;
            case 56:
               var7 = var1.a().readInt();
               if ((var10 = bc.a) instanceof db) {
                  ((db)var10).c(var7);
                  return;
               }
               break;
            case 57:
               if ((var3 = a()) != null) {
                  var4 = var1.a().readInt();

                  for(var5 = 0; var5 < var4; ++var5) {
                     var6 = var1.a().readInt();
                     var86 = var1.a().readInt();
                     var3.a.a(var6).f = var86;
                  }

                  return;
               }
               break;
            case 59:
               var4 = var1.a().readInt();
               var5 = var1.a().readInt();
               var6 = var1.a().readInt();
               var2 = var1.a().readByte();
               ce var119 = b(var1);
               var108 = var1.a().readInt();
               var126 = a(var1);
               (var104 = new bg()).c = true;
               var1.a().readBoolean();
               var104.a[0] = var6;
               var104.a[1] = var108;
               bq var131 = (bq)eg.a.a.a(var6);
               var104.b[0] = var131.m;
               var104.c[0] = var131.n;
               bq var11 = (bq)eg.a.a.a(var108);
               var104.b[1] = var11.m;
               var104.c[1] = var11.n;
               var12 = var131.m + var11.m >> 1;
               int var13 = var131.n + var11.n >> 1;
               var14 = var12 - 30;
               var15 = var12 + 30;
               bi var85;
               (var85 = new bi(var104, var2 == 0 ? var15 : var14, var13, var126, var2 == 0 ? 0 : 2)).a = false;
               eg.a.a((dz)var85);
               eg.a.c(var85);
               bi var121;
               (var121 = new bi(var104, var2 == 0 ? var14 : var15, var13, var119, var2 == 1 ? 0 : 2)).a = true;
               eg.a.a((dz)var121);
               eg.a.c(var121);
               var131.m = var2 == 0 ? var14 : var15;
               var131.n = var13 - 20;
               var131.a.f = false;
               var131.a.m = var2 == 0 ? var14 : var15;
               var131.a.n = var13;
               var131.e = var2 == 0 ? 1 : 0;
               var11.m = var2 == 0 ? var15 : var14;
               var11.n = var13 - 20;
               var11.a.f = false;
               var11.a.m = var2 == 0 ? var15 : var14;
               var11.a.n = var13;
               var11.e = var2 == 0 ? 0 : 1;
               var104.a[0] = var121;
               var104.a[1] = var85;
               var104.a(var4, var5);
               (var149 = (bx)eg.a).a.put(new Integer(var6), var104);
               if (eg.a.a == var6) {
                  var149.s();
                  var149.m();
                  eg.a.b = false;
                  b = true;
               }

               return;
            case 61:
               if ((var3 = a()) != null) {
                  var4 = var1.a().readInt();

                  for(var5 = 0; var5 < var4; ++var5) {
                     var86 = var1.a().readInt();
                     var99 = var1.a().readUTF();
                     var3.a.a(var86).a(var99);
                  }

                  return;
               }
               break;
            case 63:
               var84 = var1.a().readUTF();
               aw var111;
               (var111 = new aw(var84)).a();
               ea.e.addElement(var111);
               return;
            case 64:
               var6 = var1.a().readInt();
               if (eg.a instanceof bx) {
                  ((bx)eg.a).a(var6);
                  return;
               }
               break;
            case 65:
               fs.e.removeAllElements();
               ar var100 = new ar();
               var88 = var1.a().readInt();
               var4 = var1.a().readInt();
               var5 = var1.a().readInt();
               var6 = var1.a().readInt();
               var100.a(var88, var4, var5, var6);

               for(var88 = 0; var88 < 9; ++var88) {
                  byte[] var116 = new byte[var1.a().readInt()];
                  var1.a().read(var116);
                  var100.a[var88] = Image.createImage(var116, 0, var116.length);
                  if (var100.a[var88] == null) {
                     break;
                  }
               }

               var100.g();
               if (var4 == -1) {
                  var100.a(0, true);
               } else {
                  var100.d(0);
               }

               return;
            case 66:
               if (dh.a) {
                  byte var98 = var1.a().readByte();

                  for(var6 = 0; var6 < var98; ++var6) {
                     dh.a(var1.a().readUTF(), var1.a().readUTF());
                  }

                  return;
               }
               break;
            case 67:
               (new cp()).a(1, true);
               return;
            case 69:
               if (bc.a instanceof cp) {
                  byte var101 = var1.a().readByte();
                  var7 = var1.a().readInt();
                  var95 = var1.a().readUTF();
                  var94 = new String[var2 = var1.a().readByte()];

                  for(var4 = 0; var4 < var2; ++var4) {
                     var94[var4] = var1.a().readUTF();
                  }

                  ((cp)bc.a).a(var101, var7, var95, var94);
                  return;
               }
               break;
            case 70:
               fh.j();
               if (bc.a instanceof cp) {
                  String var96 = var1.a().readUTF();
                  var94 = new String[var97 = var1.a().readByte()];

                  for(var5 = 0; var5 < var97; ++var5) {
                     var94[var5] = var1.a().readUTF();
                  }

                  ((cp)bc.a).a(3, 0, var96, var94);
                  return;
               }
               break;
            case 71:
               if (bc.a instanceof cp) {
                  ((cp)bc.a).h();
                  return;
               }
               break;
            case 72:
               if (bc.a instanceof cp) {
                  ((cp)bc.a).b(var1.a().readInt(), var1.a().readInt());
                  return;
               }
               break;
            case 73:
               if ((var10 = bc.a) instanceof db) {
                  ((db)var10).c(var1);
                  return;
               }
               break;
            case 74:
               cx[] var93 = new cx[var5 = var1.a().readInt()];

               for(var88 = 0; var88 < var5; ++var88) {
                  var93[var88] = new cx();
                  var93[var88].a = var1.a().readInt();
                  var93[var88].b = String.valueOf(var1.a().readInt());
                  var93[var88].c = var1.a().readUTF();
                  var93[var88].a((byte)var1.a().readInt());
               }

               cr var92;
               (var92 = new cr()).a(var93);
               var92.a(1, true);
               return;
            case 75:
               if ((var10 = bc.a) instanceof db) {
                  ((db)var10).d(var1);
                  return;
               }
               break;
            case 76:
            case 79:
               if ((var10 = bc.a) instanceof cr) {
                  ((cr)var10).b(var1);
                  return;
               }
               break;
            case 80:
            case 81:
               if ((var10 = bc.a) instanceof cr) {
                  ((cr)var10).a(var1);
                  return;
               }
               break;
            case 82:
               if ((var10 = bc.a) instanceof db) {
                  ((db)var10).e(var1);
               }
            case 83:
               if ((var10 = bc.a) instanceof cr) {
                  ((cr)var10).c(var1);
                  return;
               }
               break;
            case 84:
               if ((var10 = bc.a) instanceof cr) {
                  ((cr)var10).d(var1);
                  return;
               }
               break;
            case 86:
               co var87 = null;
               fs var89;
               (var89 = bc.a()).w();
               if (var89 instanceof co) {
                  var87 = (co)var89;
               } else {
                  for(var4 = 0; var4 < var89.a.size(); ++var4) {
                     fs var102;
                     if ((var102 = (fs)var89.a.elementAt(var4)) instanceof co) {
                        var87 = (co)var102;
                        break;
                     }
                  }
               }

               boolean var91 = false;
               if (var87 == null) {
                  var87 = new co();
                  var91 = true;
               }

               var87.a(var1.a().readByte());
               if (var1.a().readInt() == 0) {
                  var87.h();
               } else {
                  var7 = var1.a().readInt();
                  var95 = var1.a().readUTF();
                  String var90 = var1.a().readUTF();
                  var99 = var1.a().readUTF();
                  var108 = var1.a().readInt();
                  var87.a(var7, var95, var90, var99, var108);
               }

               if (var91) {
                  var87.a(1, true);
                  return;
               }
               break;
            case 88:
               var88 = var1.a().readInt();
               var6 = var1.a().readInt();
               Vector var8 = new Vector();

               for(var86 = 0; var86 < var88; ++var86) {
                  var95 = var1.a().readUTF();
                  byte var110;
                  String[] var125 = new String[var110 = var1.a().readByte()];

                  for(var64 = 0; var64 < var110; ++var64) {
                     var125[var64] = var1.a().readUTF();
                  }

                  ei var157 = new ei(var95, var125);
                  var8.addElement(var157);
               }

               (new cl(var8, var6)).a(2, true);
               return;
            case 90:
               dn var117;
               fs var154;
               switch(var1.a().readByte()) {
               case 1:
                  dm[] var107 = new dm[var5 = var1.a().readInt()];

                  for(var120 = 0; var120 < var5; ++var120) {
                     dm var155;
                     (var155 = new dm()).a = var1.a().readInt();
                     var155.c = var1.a().readUTF();
                     var155.a(var1.a().readByte());
                     var155.b = var1.a().readUTF();
                     var107[var120] = var155;
                  }

                  if ((var154 = bc.a) instanceof dn) {
                     (var117 = (dn)var154).a(var107);
                  } else {
                     (var117 = new dn(this)).a(var107);
                     var117.a(2, true);
                  }

                  return;
               case 7:
                  var7 = var1.a().readInt();
                  var95 = var1.a().readUTF();
                  String var156 = var1.a().readUTF();
                  if ((var154 = bc.a) instanceof dn) {
                     (var117 = (dn)var154).a(var7, var95, var156);
                  }

                  return;
               default:
                  return;
               }
            case 91:
               var2 = var1.a().readByte();
               this.a(var2, var1);
               return;
            case 92:
               switch(var1.a().readByte()) {
               case 3:
                  if ((var3 = a()) != null) {
                     var4 = var1.a().readInt();

                     for(var5 = 0; var5 < var4; ++var5) {
                        var86 = var1.a().readInt();
                        var103 = var1.a().readUTF();
                        byte var115 = var1.a().readByte();
                        var3.a.a(var86).a(var103, var115);
                     }
                  }

                  return;
               default:
                  return;
               }
            case 93:
               var1.a().readByte();
               return;
            case 94:
               c = au.a((long)(var7 = var1.a().readInt()));
               ay var9 = new ay();
               var64 = bc.d;
               int var65 = bc.e;
               if (eg.a != null && eg.a != null) {
                  var64 = eg.a.m - eg.a.a.b;
                  var65 = eg.a.n - eg.a.b.b - 54 - 2;
               }

               var9.a(var64, var65, (long)var7 - c);
               fs.e.addElement(var9);
               c = (long)var7;
               return;
            case 95:
               this.d = var1.a().readUTF();
               this.e = (long)var1.a().readInt();
               var1.a().readInt();
               this.d = var1.a().readLong();
               this.c = true;
               return;
            case 98:
               if ((var3 = a()) != null) {
                  int var66 = var1.a().readInt();

                  for(int var158 = 0; var158 < var66; ++var158) {
                     var7 = var1.a().readInt();
                     byte var159 = var1.a().readByte();
                     var3.a.a(var7).a(var159);
                  }

                  return;
               }
               break;
            case 100:
               var2 = var1.a().readByte();
               cg var67 = a();
               if (var2 == 0) {
                  int var68 = var1.a().readInt();
                  String var69 = var1.a().readUTF();
                  boolean var160 = true;
                  if (var67 == null) {
                     var67 = new cg(var68, var69);
                     var160 = false;
                  }

                  var67.h();
                  int var161 = var1.a().readInt();

                  int var162;
                  for(var162 = 0; var162 < var161; ++var162) {
                     if (var1.a().readByte() == 1) {
                        var67.a(var1.a().readBoolean(), var1.a().readUTF(), var1.a().readByte(), var1.a().readBoolean(), var1.a().readInt(), var1.a().readInt());
                     } else {
                        var67.a(var1.a().readBoolean(), var1.a().readUTF(), var1.a().readByte(), var1.a().readByte());
                     }
                  }

                  var162 = var1.a().readInt();

                  for(int var73 = 0; var73 < var162; ++var73) {
                     var67.a(var1.a().readInt(), var1.a().readByte(), var1.a().readUTF(), var1.a().readBoolean(), var1.a().readBoolean());
                  }

                  if (!var160) {
                     var67.a(0, true);
                  }

                  var67.i();
                  return;
               }
               break;
            case 101:
               eg var10000 = en.a().a;
               eg.a();
               b();
               ed var70 = new ed(20, en.a().a, 200, 100);
               bx var71;
               (var71 = new bx(en.a().a)).l = null;
               var71.n = null;
               en.a().a.a(var71, var70, j.a.b, 200, 100);
               eg.a = var71;
               var71.d(0);
               ea.q();
               be var72;
               (var72 = new be()).c = true;
               ce var74;
               (var74 = new ce()).a = var1.a().readInt();
               var74.a = var1.a().readUTF();
               var74.j = var1.a().readInt();
               var74.h = var74.j;
               var74.k = var1.a().readInt();
               var74.i = var74.k;
               bi var75;
               (var75 = new bi(var72, 180, 209, var74, 2)).a = true;
               eg.a.a((dz)var75);
               eg.a.c(var75);
               ce var76;
               (var76 = new ce()).a = var1.a().readInt();
               var76.a = var1.a().readUTF();
               var76.j = var1.a().readInt();
               var76.h = var76.j;
               var76.k = var1.a().readInt();
               var76.i = var76.k;
               bi var77;
               (var77 = new bi(var72, 260, 209, var76, 0)).a = false;
               eg.a.a((dz)var77);
               eg.a.c(var77);
               var72.a[0] = var75;
               var72.a[1] = var77;
               ((bx)eg.a).a.put(new Integer(0), var72);
               int var78 = var1.a().readInt();

               for(int var79 = 0; var79 < var78; ++var79) {
                  bl var80;
                  (var80 = new bl()).a = var1.a().readByte();
                  var80.b = var1.a().readByte();
                  if (var80.b == 4) {
                     var80.a = var1.a().readInt();
                  }

                  int var81 = var1.a().readInt();
                  var80.b = new int[var81];
                  var80.a = new int[var81];
                  var80.c = new int[var81];
                  var80.d = new int[var81];

                  for(int var82 = 0; var82 < var81; ++var82) {
                     var80.a[var82] = var1.a().readInt();
                     System.out.println(var80.a[var82]);
                     var80.b[var82] = var1.a().readInt();
                     var80.c[var82] = var1.a().readInt();
                     var80.d[var82] = var1.a().readInt();
                  }

                  var72.a(var80);
               }

               boolean var163 = var1.a().readBoolean();
               var72.a(var163);
               bx var164;
               (var164 = a()).a(false);
               var164.b(false);
               var164.a = new bs(this, var164);
            }
         default:
         }
      } catch (IOException var83) {
         var83.printStackTrace();
      }
   }

   private static cg a() {
      cg var0 = null;
      fs var1;
      if ((var1 = bc.a()) instanceof cg) {
         var0 = (cg)var1;
      } else {
         for(int var2 = 0; var2 < var1.a.size(); ++var2) {
            fs var3;
            if ((var3 = (fs)var1.a.elementAt(var2)) instanceof cg) {
               var0 = (cg)var3;
               break;
            }
         }
      }

      return var0;
   }

   private static bx a() {
      bx var0 = null;
      fs var1;
      if ((var1 = bc.a()) instanceof bx) {
         var0 = (bx)var1;
      } else {
         for(int var2 = 0; var2 < var1.a.size(); ++var2) {
            fs var3;
            if ((var3 = (fs)var1.a.elementAt(var2)) instanceof bx) {
               var0 = (bx)var3;
               break;
            }
         }
      }

      return var0;
   }

   private static ce a(ez var0) {
      ce var1;
      (var1 = new ce()).a = var0.a().readInt();
      var1.a = var0.a().readUTF();
      var1.b = var0.a().readUTF();
      var1.b = var0.a().readInt();
      var1.h = var0.a().readInt();
      var1.i = var0.a().readInt();
      var1.j = var0.a().readInt();
      var1.k = var0.a().readInt();
      byte var2 = var0.a().readByte();
      var1.a = new int[var2];
      var1.a = new String[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.a[var3] = var0.a().readInt();
         var1.a[var3] = var0.a().readUTF();
      }

      return var1;
   }

   private static ce b(ez var0) {
      ce var1;
      (var1 = new ce()).a = var0.a().readInt();
      var1.a = var0.a().readUTF();
      var1.b = var0.a().readUTF();
      var1.b = var0.a().readInt();
      var1.c = var0.a().readInt();
      var1.d = var0.a().readInt();
      var1.e = var0.a().readInt();
      var1.f = var0.a().readInt();
      var1.g = var0.a().readInt();
      var1.h = var0.a().readInt();
      var1.i = var0.a().readInt();
      var1.j = var0.a().readInt();
      var1.k = var0.a().readInt();
      byte var2 = var0.a().readByte();
      var1.b = new String[var2];
      var1.a = new String[var2];
      var1.a = new int[var2];
      var1.b = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.a[var3] = var0.a().readInt();
         var1.a[var3] = var0.a().readUTF();
         var1.b[var3] = var0.a().readUTF();
         var1.b[var3] = var0.a().readInt();
      }

      return var1;
   }

   public final void a(Object var1) {
      gq var3;
      switch((var3 = (gq)((Object[])var1)[0]).a) {
      case 0:
         bp var4 = (bp)var3.a;
         az var2;
         (var2 = new az(var4.m, var4.n - 20, true)).a();
         fs.e.addElement(var2);
         int var5 = var4.a;
         ez var6;
         (var6 = new ez(81)).a(36);
         var6.b(var5);
         eu.a.a(var6);
         var6.a();
      default:
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      a(20, var1, var2, var3, var4, var5, var6, false);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      bc.a.translate(var5, var6);
      if (var7) {
         v.d().a(bc.a, var1 + "/" + var2, 0, 0, 0);
         bc.a.translate(0, 9);
      }

      bc.a.setColor(3691038);
      bc.a.fillRect(0, 0, var0, 4);
      var1 = var1 * (var0 - 2) / var2;
      bc.a.setColor(9830022);
      bc.a.fillRect(1, 1, var1, 1);
      bc.a.setColor(2021890);
      bc.a.fillRect(1, 2, var1, 1);
      bc.a.translate(0, 5);
      if (var7) {
         v.d().a(bc.a, var3 + "/" + var4, 0, 0, 0);
         bc.a.translate(0, 9);
      }

      bc.a.setColor(75607);
      bc.a.fillRect(0, 0, var0, 4);
      var1 = var3 * (var0 - 2) / var4;
      bc.a.setColor(6455253);
      bc.a.fillRect(1, 1, var1, 1);
      bc.a.setColor(2836897);
      bc.a.fillRect(1, 2, var1, 1);
      if (var7) {
         bc.a.translate(-var5, -var6 - 23);
      } else {
         bc.a.translate(-var5, -var6 - 5);
      }
   }

   public final void a() {
      if (a) {
         boolean var1;
         if (!(var1 = au.a(h - f) < 2)) {
            int var2 = h - f >> 1;
            f += var2;
         } else {
            b = h;
            var1 = true;
         }

         boolean var4;
         if (!(var4 = au.a(i - g) < 2)) {
            int var3 = i - g >> 1;
            g += var3;
         } else {
            c = i;
            var4 = true;
         }

         if (var1 && var4) {
            a = false;
         }
      }

   }

   private void a(int var1, ez var2) {
      int var3;
      int var9;
      int var10;
      int var16;
      String var18;
      String var20;
      int var32;
      byte var33;
      byte var35;
      byte var36;
      Vector var39;
      String var40;
      byte var43;
      cs var44;
      af var45;
      boolean var47;
      boolean var48;
      String var50;
      int var54;
      String var57;
      String var59;
      int var60;
      switch(var1) {
      case 1:
         var20 = var2.a().readUTF();
         var35 = var2.a().readByte();
         var33 = var2.a().readByte();
         var32 = var2.a().readInt();
         var39 = new Vector();
         var43 = 0;
         if (var20.length() == 0) {
            var43 = 1;
         }

         for(var54 = 0; var54 < var32; ++var54) {
            var9 = var2.a().readInt();
            var2.a().readInt();
            String var51 = var2.a().readUTF();
            String var52 = var2.a().readUTF();
            af var53 = new af(var9, (String)null, var51, var52, var43);
            var39.addElement(var53);
         }

         var47 = false;
         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            var44 = (cs)bc.a;
         } else {
            var44 = new cs();
            var47 = true;
         }

         var44.a(var20.length() == 0 ? null : var20, var39, var35, var33);
         var44.a(0, var47);
         return;
      case 2:
         return;
      case 3:
         var10 = var2.a().readInt();
         boolean var49 = var2.a().readBoolean();
         int var12 = var2.a().readInt();
         var20 = var2.a().readUTF();
         int var13 = var2.a().readInt();
         int var14 = var2.a().readInt();
         var35 = var2.a().readByte();
         var33 = var2.a().readByte();
         var36 = var2.a().readByte();
         var39 = new Vector();
         var43 = 0;
         if (var49) {
            var43 = 1;
         }

         for(int var15 = 0; var15 < var36; ++var15) {
            var54 = var2.a().readInt();
            String var56 = var2.a().readUTF();
            var57 = var2.a().readUTF();
            var59 = var2.a().readUTF();
            af var61 = new af(var54, var56.length() == 0 ? null : var56, var57, var59, var43);
            var39.addElement(var61);
         }

         boolean var55 = var2.a().readBoolean();
         var47 = false;
         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            var44 = (cs)bc.a;
         } else {
            var44 = new cs();
            var47 = true;
         }

         var44.a(var35, var33, var10, var49, var12, var20, var13, var14, var39, var55);
         var44.a(0, var47);
         return;
      case 4:
         var36 = var2.a().readByte();
         var39 = new Vector();

         for(var54 = 0; var54 < var36; ++var54) {
            var9 = var2.a().readInt();
            var57 = var2.a().readUTF();
            var59 = var2.a().readUTF();
            var18 = var2.a().readUTF();
            af var26 = new af(var9, var57.length() == 0 ? null : var57, var59, var18, (byte)1);
            var39.addElement(var26);
         }

         var47 = false;
         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            var44 = (cs)bc.a;
         } else {
            var44 = new cs();
            var47 = true;
         }

         var44.b(var39);
         var44.a(0, var47);
         return;
      case 5:
         var54 = var2.a().readInt();
         var47 = var2.a().readBoolean();
         fh.j();
         if (var47 && bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            ((cs)bc.a).b(var54);
            return;
         }
         break;
      case 6:
         var16 = var2.a().readInt();
         var47 = var2.a().readBoolean();
         fh.j();
         if (var47 && bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            ((cs)bc.a).b(var16);
            return;
         }
         break;
      case 7:
         return;
      case 8:
         return;
      case 9:
         var32 = var2.a().readInt();
         var39 = new Vector();

         for(int var58 = 0; var58 < var32; ++var58) {
            var60 = var2.a().readInt();
            var20 = var2.a().readUTF();
            af var42 = new af(var60, (String)null, var20, "", (byte)1);
            var39.addElement(var42);
         }

         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c) && ((cs)bc.a).b == 16) {
            return;
         }

         (var44 = new cs()).c(var39);
         var44.a(0, true);
         return;
      case 10:
      case 11:
      case 13:
      case 18:
      case 21:
      default:
         break;
      case 12:
         return;
      case 14:
         var10 = var2.a().readInt();
         String[] var17 = new String[var36 = var2.a().readByte()];

         for(var60 = 0; var60 < var36; ++var60) {
            var17[var60] = var2.a().readUTF();
         }

         var47 = false;
         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            var44 = (cs)bc.a;
         } else {
            var44 = new cs();
            var47 = true;
         }

         var44.a(var10, var17);
         var44.a(1, var47);
         return;
      case 15:
         var35 = var2.a().readByte();
         var33 = var2.a().readByte();
         var36 = var2.a().readByte();
         var39 = new Vector();

         for(var60 = 0; var60 < var36; ++var60) {
            var16 = var2.a().readInt();
            var20 = var2.a().readUTF();
            var40 = var2.a().readUTF();
            var50 = var2.a().readUTF();
            var45 = new af(var16, var20.length() == 0 ? null : var20, var40, var50, (byte)0);
            var39.addElement(var45);
         }

         var47 = false;
         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            var44 = (cs)bc.a;
         } else {
            var44 = new cs();
            var47 = true;
         }

         var44.a(var35, var33, var39);
         var44.a(0, var47);
         return;
      case 16:
         var35 = var2.a().readByte();
         var33 = var2.a().readByte();
         var36 = var2.a().readByte();
         var39 = new Vector();

         for(var60 = 0; var60 < var36; ++var60) {
            var16 = var2.a().readInt();
            var20 = var2.a().readUTF();
            var40 = var2.a().readUTF();
            var50 = var2.a().readUTF();
            var45 = new af(var16, var20.length() == 0 ? null : var20, var40, var50, (byte)0);
            var39.addElement(var45);
         }

         var47 = false;
         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            var44 = (cs)bc.a;
         } else {
            var44 = new cs();
            var47 = true;
         }

         var44.b(var35, var33, var39);
         var44.a(0, var47);
         return;
      case 17:
         var18 = var2.a().readUTF();
         var1 = var2.a().readInt();
         var40 = var2.a().readUTF();
         var48 = var2.a().readBoolean();
         boolean var41 = var2.a().readBoolean();
         String[] var30 = null;
         if (var41) {
            (var30 = new String[7])[0] = var2.a().readUTF();
            var30[1] = var2.a().readUTF();
            var30[2] = var2.a().readUTF();
            var30[3] = var2.a().readUTF();
            var30[4] = var2.a().readUTF();
            var30[5] = var2.a().readUTF();
            var30[6] = var2.a().readUTF();
         }

         var47 = false;
         if (bc.a != null && "SCREEN_GUILD".equals(bc.a.c)) {
            var44 = (cs)bc.a;
         } else {
            var44 = new cs();
            var47 = true;
         }

         var44.a(var48, var1, var18, var40, var30);
         var44.a(1, var47);
         return;
      case 19:
         boolean var22 = var2.a().readBoolean();
         String var27 = var2.a().readUTF();
         gq var25 = null;
         if (var22) {
            var25 = new gq("sửa", new bt(this));
         }

         fh.a(var27, var25, gq.b);
         return;
      case 20:
         bc.a().v();
         var10 = var2.a().readInt();
         var2.a().readUTF();
         byte var21 = var2.a().readByte();
         dh var24 = new dh();

         for(int var31 = 0; var31 < var21; ++var31) {
            String var34 = var2.a().readUTF();
            String var38 = var2.a().readUTF();
            dh.a(var34, var38);
         }

         var24.a(var10);
         var24.j_();
         return;
      case 22:
         if (!dh.a) {
            bb var29;
            (var29 = new bb(var2.a().readUTF() + ": " + var2.a().readUTF())).a();
            fs.e.addElement(var29);
            return;
         }

         dh.a(var2.a().readUTF(), var2.a().readUTF());
         return;
      case 23:
         bx var28;
         if ((var28 = a()) != null) {
            var32 = var2.a().readInt();

            for(int var37 = 0; var37 < var32; ++var37) {
               var3 = var2.a().readInt();
               var20 = var2.a().readUTF();
               var28.a.a(var3).a = var20;
            }

            return;
         }
         break;
      case 24:
         bc.a.w();
         boolean var6 = var2.a().readByte() == 1;
         var3 = var2.a().readInt();
         int[] var7 = new int[3];
         int[] var19 = new int[3];
         String[] var4 = new String[3];
         String[] var5 = new String[3];
         String[] var8 = new String[3];

         for(var9 = 0; var9 < 3; ++var9) {
            var7[var9] = var2.a().readInt();
            var19[var9] = var2.a().readInt();
            var4[var9] = var2.a().readUTF();
            var5[var9] = var2.a().readUTF();
            var8[var9] = var2.a().readUTF();
         }

         fs var46 = bc.a;
         cu var23 = null;
         if (var46 instanceof cu) {
            var23 = (cu)var46;
         } else {
            for(var10 = 0; var10 < var46.a.size(); ++var10) {
               fs var11;
               if ((var11 = (fs)var46.a.elementAt(var10)) instanceof cu) {
                  var23 = (cu)var11;
                  break;
               }
            }
         }

         var48 = var23 == null;
         if (var23 == null) {
            var23 = new cu(var6 ? 0 : 1);
         }

         var23.a(var3);
         var23.a(var7, var19, var4, var8, var5);
         var23.a(0, var48);
      }

   }

   public static void b() {
      if (a != null) {
         a.a();
      }

   }
}
