import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ed {
   public int a;
   public int b;
   private int e;
   public int c;
   public int d;
   private static byte[][][] a = new byte[][][]{{{0, 0}, {0, 1}}, {{0, 0}, {1, 0}}, {{0, 0}, {1, 1}}, {{0, 1}, {0, 0}}, {{0, 1}, {0, 1}}, {{0, 1}, {1, 0}}, {{0, 1}, {1, 1}}, {{1, 0}, {0, 0}}, {{1, 0}, {0, 1}}, {{1, 0}, {1, 0}}, {{1, 0}, {1, 1}}, {{1, 1}, {0, 0}}, {{1, 1}, {0, 1}}, {{1, 1}, {1, 0}}};
   private int f;
   private byte[][][] b;
   private byte[][] a;
   private Image[] a;
   private int[] a;
   private byte[] d;
   public dy[] a;
   public short[] a;
   public short[] b;
   public byte[] a;
   public byte[] b;
   public byte[] c;
   public dx[] a;
   public at[] a;
   private gn a;

   public ed() {
      this.a = new gn(0, 0, bc.b, bc.c);
   }

   public ed(int var1, eg var2, int var3, int var4) {
      this.a = new gn(0, 0, bc.b, bc.c);
      this.a = var1;
      var3 = a(var1);
      DataInputStream var8 = null;
      if ((var3 != b(var1) || !a(var1)) && (var1 < 2 || var1 > 5)) {
         byte[] var6;
         if ((var6 = c.a("mapDynamicData_" + var1, 1)) != null) {
            ByteArrayInputStream var7 = new ByteArrayInputStream(var6);
            var8 = new DataInputStream(var7);
         }
      } else {
         InputStream var5 = gj.a("/maps/" + var1 + ".dat");
         var8 = new DataInputStream(var5);
      }

      this.a(var8, var2);
   }

   public static int a(int var0) {
      Integer var1;
      if ((var1 = c.a("mapVersion_" + var0)) == null) {
         return a(var0) ? b(var0) : -1;
      } else {
         return var1;
      }
   }

   private static boolean a(int var0) {
      try {
         InputStream var2 = gj.a("/maps/" + var0 + ".dat");
         (new DataInputStream(var2)).readByte();
         return true;
      } catch (Exception var1) {
         return false;
      }
   }

   public static void a(int var0, int var1) {
      String var2;
      c.a(var2 = "mapVersion_" + var0);
      c.a(var2, var1);
   }

   public static void a(byte[] var0, int var1) {
      try {
         c.a("mapDynamicData_" + var1);
         a(var1);
         c.a("mapDynamicData_" + var1, var0);
      } catch (Exception var2) {
      }
   }

   private static void a(int var0) {
      try {
         byte[] var5;
         if ((var5 = c.a("mapDynamicData_" + var0, 1)) != null) {
            ByteArrayInputStream var6 = new ByteArrayInputStream(var5);
            DataInputStream var7;
            int var1 = (var7 = new DataInputStream(var6)).readByte() + var7.readByte();

            for(int var2 = 0; var2 < var1; ++var2) {
               short var3 = var7.readShort();
               if (var7.readByte() == 1) {
                  c.a("ani11_" + var3);
               } else {
                  c.a("image10_" + var3);
               }
            }
         }

      } catch (Exception var4) {
      }
   }

   private void a(DataInputStream var1, eg var2) {
      try {
         byte var3 = var1.readByte();
         this.a = new Image[var3];
         byte var4 = var1.readByte();
         int var11 = var3 + var4;
         this.a = new int[var11];
         this.d = new byte[var11];

         int var5;
         for(var5 = 0; var5 < var11; ++var5) {
            this.a[var5] = var1.readShort();
            this.d[var5] = var1.readByte();
         }

         for(var5 = 0; var5 < var3; ++var5) {
            this.a[var5] = a("" + this.a[var5]);
         }

         this.b = var1.readByte();
         this.e = var1.readByte();
         this.c = this.b * 24;
         this.d = this.e * 24;
         this.f = var1.readByte();
         this.b = new byte[this.f][this.e][this.b];

         int var9;
         for(var5 = 0; var5 < this.f; ++var5) {
            for(var9 = 0; var9 < this.e; ++var9) {
               var1.read(this.b[var5][var9]);
            }
         }

         this.a = new byte[this.e][this.b];

         for(var5 = 0; var5 < this.e; ++var5) {
            var1.read(this.a[var5]);
         }

         var5 = var1.readInt();
         this.a = new short[var5];
         this.b = new short[var5];
         this.a = new byte[var5];
         this.b = new byte[var5];
         this.c = new byte[var5];
         this.a = new dx[var11];

         byte var6;
         int var13;
         int var14;
         for(var11 = 0; var11 < var5; ++var11) {
            var6 = var1.readByte();
            this.a[var11] = var6;
            boolean var7 = false;
            if (this.a[var6] == null) {
               this.a[var6] = new dx(this.a[var6], this.d[var6]);
               var7 = true;
            }

            dx var10 = this.a[var6];
            this.a[var11] = var1.readShort();
            this.b[var11] = var1.readShort();
            this.c[var11] = var1.readByte();
            if (this.d[var6] == 1) {
               if (var7) {
                  var10.a(new gn(var1.readByte(), var1.readByte(), var1.readByte(), var1.readByte()));
                  var10.a = var1.readByte();
                  this.b[var11] = var10.a;
                  gc var12;
                  if ((var12 = a("" + var10.a)) != null) {
                     var10.a = new gb[var12.a.length];

                     for(var14 = 0; var14 < var12.a.length; ++var14) {
                        var10.a[var14] = new gb(var12.a[var14]);
                     }
                  }
               } else {
                  for(var13 = 0; var13 < 5; ++var13) {
                     this.b[var11] = var1.readByte();
                  }
               }
            } else if (var7 && var10.b == null) {
               var10.a(new gn(-64, -64, 127, 127));
               var10.b = a("" + var10.a);
            }
         }

         var11 = var1.readInt();
         this.a = new at[var11];
         var9 = 0;

         for(var13 = 0; var13 < var11; ++var13) {
            at var15 = at.a(var2, var1);
            this.a[var9++] = var15;
         }

         var6 = var1.readByte();
         this.a = new dy[var6];

         for(var14 = 0; var14 < var6; ++var14) {
            this.a[var14] = new dy(var1.readByte(), var1.readShort(), var1.readShort());
         }

         var1.close();
      } catch (Exception var8) {
         a(this.a, b(this.a));
      }
   }

   public final boolean a(int var1, int var2) {
      int var3 = var1 / 24;
      int var4 = var2 / 24;
      if (var3 >= 0 && var4 >= 0 && var3 < this.b && var4 < this.e) {
         byte var5;
         if ((var5 = this.a[var4][var3]) == 0) {
            return true;
         } else if (var5 == 15) {
            return false;
         } else {
            var1 = var1 % 24 / 12;
            var2 = var2 % 24 / 12;
            return a[var5 - 1][var2][var1] == 0;
         }
      } else {
         return false;
      }
   }

   public final void a(int var1, int var2, boolean var3) {
      bc.a.setColor(16777215);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      int var4 = var1 / 24;
      int var5 = var2 / 24;
      if (var4 < 0) {
         var4 = 0;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      int var6 = var5 + bc.c / 24 + 2;
      int var7 = var4 + bc.b / 24 + 2;
      if (var6 > this.e) {
         var6 = this.e;
      }

      if (var7 > this.b) {
         var7 = this.b;
      }

      bc.a.translate(-var1, -var2);

      int var9;
      for(int var8 = 0; var8 < this.f; ++var8) {
         for(var9 = var5; var9 < var6; ++var9) {
            for(int var10 = var4; var10 < var7; ++var10) {
               if (this.a[this.b[var8][var9][var10] >> 4] != null) {
                  bc.a.drawRegion(this.a[this.b[var8][var9][var10] >> 4], ((this.b[var8][var9][var10] & 15) - 1) * 24, 0, 24, 24, 0, var10 * 24, var9 * 24, 0);
               } else {
                  this.a[this.b[var8][var9][var10] >> 4] = a("" + this.a[this.b[var8][var9][var10] >> 4]);
               }
            }
         }
      }

      if (var3) {
         this.a.a = var1;
         this.a.b = var2;

         for(var9 = 0; var9 < this.a.length; ++var9) {
            gn var11;
            dx var12;
            gn var10000 = var11 = (var12 = this.a[this.a[var9]]).a();
            var10000.a += this.a[var9];
            var11.b += this.b[var9] - this.c[var9];
            if (this.a.a(var11)) {
               var12.a = this.b[var9];
               var12.c(this.a[var9], this.b[var9] - this.c[var9]);
            }
         }
      }

      bc.a.translate(var1, var2);
   }

   private static int b(int var0) {
      switch(var0) {
      case 1:
      case 6:
      case 7:
      case 10:
         return 3;
      case 2:
      case 3:
      case 4:
      case 5:
      case 9:
      default:
         return 1;
      case 8:
         return 2;
      }
   }

   private static Image a(String var0) {
      try {
         return Image.createImage("/newMapData/" + var0 + ".png");
      } catch (IOException var1) {
         return null;
      }
   }

   private static gc a(String var0) {
      try {
         Image var1 = Image.createImage("/newMapData/" + var0 + "_a.png");
         InputStream var4 = gj.a("/newMapData/" + var0 + "_b");
         DataInputStream var5 = new DataInputStream(var4);
         gc var2;
         (var2 = new gc()).a(var5);

         for(int var6 = 0; var6 < var2.a.length; ++var6) {
            var2.a[var6].a = var1;
         }

         return var2;
      } catch (Exception var3) {
         return null;
      }
   }
}
