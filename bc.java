import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public final class bc extends Canvas implements Runnable {
   private static int l = 800;
   private static int m = 10;
   private long a;
   private int n = -1982;
   private static boolean c = false;
   private int[][] a = new int[10][3];
   private int o = 0;
   public static boolean a;
   public static boolean b;
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static int e;
   public static int f;
   public static int g;
   public static int h;
   public static int i;
   public static fs a;
   private static int p = 0;
   public MIDlet a;
   public static bc a;
   private int q;
   public static Graphics a;
   public bd a;
   public fa a;
   private int r = 0;
   private int s = 7;
   private int t = 0;
   private int u = 0;
   public int j;
   public int k;

   public static bc a(MIDlet var0) {
      if (a == null) {
         a = new bc(var0);
      }

      return a;
   }

   private bc(MIDlet var1) {
      this.setFullScreenMode(true);
      b = this.getWidth();
      c = this.getHeight();
      c();
      p = this.a();
      this.a = var1;
   }

   private int a() {
      if (this.getKeyCode(8) == -20) {
         return 1;
      } else if (System.getProperty("microedition.platform").indexOf("SonyEricsson") != -1) {
         return 2;
      } else {
         try {
            Class.forName("com.samsung.util.Vibration");
            return 3;
         } catch (Exception var3) {
            try {
               Class.forName("com.siemens.mp.io.File");
               return 5;
            } catch (Exception var2) {
               return 0;
            }
         }
      }
   }

   protected final void sizeChanged(int var1, int var2) {
      super.sizeChanged(var1, var2);
      b = var1;
      c = var2;
      c();
   }

   private static void c() {
      d = b >> 1;
      e = c >> 1;
      f = b / 3;
      int var10000 = c;
      g = 2 * b / 3;
      var10000 = c;
      h = 3 * b / 4;
      i = 3 * c / 4;
      var10000 = b;
      var10000 = c;
      var10000 = b;
      if (a != null) {
         a.f_();
      }

   }

   public static void a(fs var0) {
      if (a != var0) {
         if (a != null) {
            a.f();
            a = null;
         }

         if (var0 != null) {
            a = var0;
            var0.b();
         } else {
            a = null;
         }
      }
   }

   public static fs a() {
      return a;
   }

   public final void a() {
      (new Thread(this)).start();
   }

   public final void run() {
      a = true;

      while(true) {
         do {
            if (!a) {
               return;
            }
         } while(b);

         try {
            long var1 = System.currentTimeMillis();
            ++a;
            if (this.q > 0) {
               --this.q;
               if (this.q == 0) {
                  Display.getDisplay(a.a).vibrate(0);
               }
            }

            bc var3 = this;
            if (this.o != 0) {
               synchronized(this) {
                  for(int var7 = 0; var7 < var3.o; ++var7) {
                     int[] var4;
                     switch((var4 = var3.a[var7])[0]) {
                     case 0:
                     case 1:
                        a.a(var4[0], var4[1]);
                        break;
                     case 2:
                        a.a(var4[1], var4[2]);
                        break;
                     case 3:
                        a.a_(var4[1], var4[2]);
                        break;
                     case 4:
                        a.c(var4[1], var4[2]);
                     }
                  }

                  var3.o = 0;
               }
            }

            long var6 = System.currentTimeMillis();
            if (var3.n != -1982 && var3.a <= var6) {
               synchronized(var3) {
                  if (var3.o < 10) {
                     var3.a[var3.o][0] = 0;
                     var3.a[var3.o][1] = var3.n;
                     ++var3.o;
                  }
               }

               var3.a = var6 + (long)m;
            }

            if (a != null) {
               a.h_();
               a.t();

               for(int var12 = 0; var12 < a.a.size(); ++var12) {
                  fs var13;
                  if ((var13 = (fs)a.a.elementAt(var12)).d) {
                     var13.h_();
                  }
               }
            }

            if (this.a != null) {
               this.a.a();
            }

            this.repaint();
            this.serviceRepaints();
            if (this.a != null && this.a.a() && this.a.b) {
               this.a.a();
            }

            long var11;
            if ((var11 = 15L - (System.currentTimeMillis() - var1)) > 0L) {
               Thread.sleep(var11);
            }
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }

   public final void keyPressed(int var1) {
      if ((var1 = a(var1)) != -6 && var1 != -7) {
         this.n = var1;
         this.a = System.currentTimeMillis() + (long)l;
      }

      if (!a.a(var1)) {
         synchronized(this) {
            if (this.o < 10) {
               this.a[this.o][0] = 0;
               this.a[this.o][1] = var1;
               ++this.o;
            }

         }
      }
   }

   public final void keyReleased(int var1) {
      this.n = -1982;
      var1 = a(var1);
      fs var10000 = a;
      fs.a();
      synchronized(this) {
         if (this.o < 10) {
            this.a[this.o][0] = 1;
            this.a[this.o][1] = var1;
            ++this.o;
         }

      }
   }

   private static int a(int var0) {
      if (p == 1) {
         switch(var0) {
         case -6:
            return -2;
         case -5:
            return -4;
         case -4:
         case -3:
         default:
            break;
         case -2:
            return -3;
         }
      } else if (p == 5) {
         switch(var0) {
         case -62:
            return -4;
         case -61:
            return -3;
         case -60:
            return -2;
         case -59:
            return -1;
         case -26:
            return -5;
         case -4:
            return -7;
         case -1:
            return -6;
         }
      }

      switch(var0) {
      case -204:
      case -8:
      case 8:
         return -8;
      case -39:
      case -2:
         return -2;
      case -38:
      case -1:
         return -1;
      case -22:
      case -7:
         return -7;
      case -21:
      case -6:
      case 4098:
         return -6;
      case -20:
      case -5:
      case 10:
         return -5;
      case -4:
         return -4;
      case -3:
         return -3;
      default:
         return var0;
      }
   }

   protected final void keyRepeated(int var1) {
   }

   private boolean a(int var1, int var2) {
      if (this.r == 0) {
         this.t = var1;
         this.u = var2;
         ++this.r;
         return false;
      } else {
         ++this.r;
         if (this.r > this.s) {
            return true;
         } else if (3 * b / 100 <= Math.abs(this.t - var1)) {
            this.r = this.s + 1;
            return true;
         } else if (3 * c / 100 <= Math.abs(this.u - var2)) {
            this.r = this.s + 1;
            return true;
         } else {
            return false;
         }
      }
   }

   protected final void pointerDragged(int var1, int var2) {
      synchronized(this) {
         if (this.a(var1, var2) && this.o < 10) {
            this.a[this.o][0] = 3;
            this.a[this.o][1] = var1;
            this.a[this.o][2] = var2;
            ++this.o;
         }

      }
   }

   protected final void pointerPressed(int var1, int var2) {
      this.j = var1;
      this.k = var2;
      synchronized(this) {
         if (this.o < 10) {
            this.a[this.o][0] = 2;
            this.a[this.o][1] = var1;
            this.a[this.o][2] = var2;
            ++this.o;
         }

      }
   }

   protected final void pointerReleased(int var1, int var2) {
      if (this.r == 0 && var1 != this.j && var2 != this.k) {
         this.a(this.j, this.k);
         if (this.a(var1, var2)) {
            this.pointerDragged(this.j, this.k);
            this.pointerDragged(var1, var2);
         }
      }

      this.r = 0;
      synchronized(this) {
         if (this.o < 10) {
            this.a[this.o][0] = 4;
            this.a[this.o][1] = var1;
            this.a[this.o][2] = var2;
            ++this.o;
         }

      }
   }

   protected final void paint(Graphics var1) {
      if (a != var1) {
         a = var1;
      }

      if (a != null) {
         a.g_();
      } else {
         var1.setColor(0);
         var1.fillRect(0, 0, b, c);
      }
   }

   public final void b() {
      Display.getDisplay(this.a).setCurrent(this);
      this.setFullScreenMode(true);
   }
}
