import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class bi extends dz {
   boolean a;
   long a;
   int a;
   int b;
   public int c;
   private Image a;
   public int d;
   public int e;
   public int f;
   boolean b;
   private Vector a = new Vector();
   private bk a;
   boolean c;
   boolean d;
   int g;
   int h;
   int i;
   boolean e;
   String a;
   int j;
   int k;
   public int l = 0;
   bm a;
   public ce a;
   private bk b;
   private bj a;
   private bk c;
   private bj b;
   private bj c;
   private bj d;
   private gb a;
   private b a;
   private final Hashtable a = new Hashtable(6);

   public bi(bm var1, int var2, int var3, ce var4, int var5) {
      this.a = var1;
      this.a = var4;
      this.a((gn)(new gn(10, -30, 21, 30)));
      this.d = var5;
      this.m = var2;
      this.n = var3;
      bj var6 = new bj(this, 5, (Object)null);
      this.b = new bk(this, new bj[]{var6});
      this.a = new bj(this, 7, (Object)null);
      this.c = new bk(this, new bj[]{this.a});
      int var7 = var5 == 2 ? 1 : -1;
      this.b = new bj(this, 1, new Integer(var7 * 20));
      this.c = new bj(this, 1, new Integer(var7 * -20));
      int[] var8 = new int[]{6, var2 + var7 * 20, var3 - 10};
      this.d = new bj(this, 4, var8);
   }

   private void d() {
      if (this.a.isEmpty()) {
         this.a = null;
      } else {
         bk var1 = (bk)this.a.firstElement();
         this.a.removeElementAt(0);
         this.a = var1;
      }
   }

   public final void a(int var1, int var2) {
      bc.a.translate(-var1, -var2);
      boolean var3 = true;
      if (this.a == null) {
         this.a = br.a.a(this.a.a);
      } else {
         bc.a.drawImage(v.k, this.m - 11, this.n - 6, 0);
         if (this.l == 0) {
            br.a.a(this.a, this.m - (this.a.getWidth() >> 2), this.n - this.a.getHeight(), this.d);
         } else {
            bv var10000 = br.a;
            Image var21 = this.a;
            int var10001 = this.m - (this.a.getWidth() >> 2);
            int var10002 = this.n - this.a.getHeight();
            int var8 = this.l;
            int var7 = this.d;
            int var6 = var10002;
            int var5 = var10001;
            Image var4 = var21;
            int var9 = var21.getWidth() >> 1;
            int var10 = var4.getHeight() / 4;

            for(int var16 = 0; var16 < var10; ++var16) {
               bc.a.drawRegion(var4, bv.b * var9, var16 << 2, var9, 4 - var8, var7, var5, var6 + (var16 << 2), 0);
            }

            long var22;
            if ((var22 = System.currentTimeMillis()) - bv.b >= 200L) {
               bv.b = var22;
               bv.b = (bv.b + 1) % 2;
            }
         }

         if (this.c) {
            System.out.println("play old animation");
            gb var19;
            if ((var19 = this.a) != null) {
               switch(this.g) {
               case 6:
                  var19.a(bc.a, this.h, this.i, (this.d + 2) % 4);
                  break;
               case 7:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 16:
               case 17:
               case 19:
               default:
                  var19.a(bc.a, this.h, this.i, 0);
                  break;
               case 8:
               case 15:
               case 18:
               case 20:
               case 21:
                  var19.a(bc.a, this.h, this.i, this.d);
               }
            }
         }

         if (this.d) {
            System.out.println("play new animation");
            b var20;
            if ((var20 = this.a) != null) {
               var20.a(bc.a);
               var20.a();
            }
         }

         if (this.e) {
            switch(this.j) {
            case 0:
               v.e.a(bc.a, this.a, this.m, this.n - this.k - 20, 17);
               break;
            case 1:
               v.d.a(bc.a, this.a, this.m, this.n - this.k - 20, 17);
            }
         }

         if (this.b) {
            br.a(20, this.e, this.a.j, this.f, this.a.k, this.m - 10, this.n - this.a.getHeight() - 8);
         } else {
            br.a(20, this.a.h, this.a.j, this.a.i, this.a.k, this.m - 10, this.n - this.a.getHeight() - 8);
         }

         if (this.a && this.c == 0 && this.b > 0) {
            int var18 = (int)(System.currentTimeMillis() - this.a);
            if ((var18 = this.a - var18) < 0) {
               var18 = 0;
            }

            bc.a.setColor(16711680);
            bc.a.fillArc(this.m - 5, this.n - 50, 10, 10, 0, var18 * 360 / this.b);
         }
      }

      bc.a.translate(var1, var2);
   }

   public final void a(long var1) {
      super.a(var1);
      bi var6 = this;
      if (this.a != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < var6.a.a.length; ++var3) {
            var6.a.a[var3].b();
            if (!var6.a.a[var3].a) {
               var2 = false;
            }
         }

         if (var2) {
            var6.d();
         }
      } else {
         this.d();
      }

      gb var7;
      if (var6.c && (var7 = var6.a) != null) {
         if (var6.g != 6) {
            int var10000 = var6.g;
            boolean var10001 = true;
         }

         var7.a(var1);
      }

   }

   final void a() {
      this.c = 1;
      this.b.a();
      this.a.addElement(new bk(this, new bj[]{this.b}));
      this.d.a();
      this.a.addElement(new bk(this, new bj[]{this.d}));
      this.c.a();
      this.a.addElement(new bk(this, new bj[]{this.c}));
      this.a.addElement(this.b);
   }

   final void c(int var1, int var2) {
      this.c = 1;
      bj var3;
      if (var1 != 0) {
         var3 = new bj(this, 6, new Object[]{String.valueOf(var1), null});
         this.a.addElement(new bk(this, new bj[]{var3}));
      }

      if (var2 != 0) {
         var3 = new bj(this, 6, new Object[]{String.valueOf(var2), new Integer(1)});
         this.a.addElement(new bk(this, new bj[]{var3}));
      }

      this.a.a();
      this.a.a = new int[]{this.a.h, this.a.h + var1, this.a.i, this.a.i + var2};
      this.a.addElement(this.c);
      this.a.addElement(this.b);
   }

   final void a(int var1) {
      this.c = 1;
      int[] var2 = new int[]{5, this.m, this.n - 10};
      bj var5 = new bj(this, 4, var2);
      bj var3 = new bj(this, 3, new Integer(500));
      bj var4 = new bj(this, 6, new Object[]{String.valueOf(var1), null});
      this.a.addElement(new bk(this, new bj[]{var5, var3, var4}));
      this.a.a();
      this.a.a = new int[]{this.a.h, this.a.h + var1, this.a.i, this.a.i};
      this.a.addElement(this.c);
      this.a.addElement(this.b);
   }

   final void b() {
      this.c = 1;
      int var1 = this.d == 2 ? -1 : 1;
      bj var2 = new bj(this, 1, new Integer(var1 * 20));
      int[] var3 = new int[]{5, this.m, this.n - 10};
      bj var5 = new bj(this, 4, var3);
      this.a.addElement(new bk(this, new bj[]{var2, var5}));
      bj var4 = new bj(this, 1, new Integer(var1 * -20));
      this.a.addElement(new bk(this, new bj[]{var4}));
      this.a.addElement(this.b);
   }

   final void b(int var1) {
      this.c = 1;
      int[] var2 = new int[]{7, this.m, this.n - 15};
      bj var3 = new bj(this, 4, var2);
      this.a.addElement(new bk(this, new bj[]{var3}));
      if (this.a.i + var1 >= 0) {
         this.a.a();
         this.a.a = new int[]{this.a.h, this.a.h, this.a.i, this.a.i + var1};
         this.a.addElement(this.c);
      }

      this.a.addElement(this.b);
   }

   final void c(int var1) {
      this.c = 1;
      int[] var2 = new int[]{4, this.m, this.n - 10};
      bj var5 = new bj(this, 4, var2);
      bj var3 = new bj(this, 3, new Integer(500));
      bj var4 = new bj(this, 6, new Object[]{String.valueOf(var1), null});
      this.a.addElement(new bk(this, new bj[]{var5, var3, var4}));
      this.a.a();
      this.a.a = new int[]{this.a.h, this.a.h + var1, this.a.i, this.a.i};
      this.a.addElement(this.c);
      this.a.addElement(this.b);
   }

   final void a(int[] var1) {
      int var2 = var1[0];
      int var3 = var1[1];
      int var5 = var1[2];
      this.c = 1;
      int[] var6 = new int[]{var2, this.m, this.n - 15};
      bj var7 = new bj(this, 4, var6);
      bj var4;
      if (var3 < 0) {
         var4 = new bj(this, 3, new Integer(500));
         this.a.addElement(new bk(this, new bj[]{var7, var4}));
      } else {
         this.a.addElement(new bk(this, new bj[]{var7}));
      }

      if (var3 != 0) {
         var4 = new bj(this, 6, new Object[]{String.valueOf(var3), null});
         this.a.addElement(new bk(this, new bj[]{var4}));
      }

      if (var5 != 0) {
         var4 = new bj(this, 6, new Object[]{String.valueOf(var5), new Integer(1)});
         this.a.addElement(new bk(this, new bj[]{var4}));
      }

      this.a.a();
      this.a.a = new int[]{this.a.h, this.a.h + var3, this.a.i, this.a.i + var5};
      this.a.addElement(this.c);
      this.a.addElement(this.b);
   }

   final void b(int[] var1) {
      int var2 = var1[0];
      int var3 = var1[1];
      int var5 = var1[2];
      this.c = 2;
      int[] var6 = new int[]{var2, this.m, this.n};
      bj var7 = new bj(this, 9, var6);
      bj var4;
      if (var3 < 0) {
         var4 = new bj(this, 3, new Integer(500));
         this.a.addElement(new bk(this, new bj[]{var7, var4}));
      } else {
         this.a.addElement(new bk(this, new bj[]{var7}));
      }

      if (var3 != 0) {
         var4 = new bj(this, 6, new Object[]{String.valueOf(var3), null});
         this.a.addElement(new bk(this, new bj[]{var4}));
      }

      if (var5 != 0) {
         var4 = new bj(this, 6, new Object[]{String.valueOf(var5), new Integer(1)});
         this.a.addElement(new bk(this, new bj[]{var4}));
      }

      this.a.a();
      this.a.a = new int[]{this.a.h, this.a.h + var3, this.a.i, this.a.i + var5};
      this.a.addElement(this.c);
      this.a.addElement(this.b);
   }

   public final void c() {
      this.c = 1;
      bj var1 = new bj(this, 8, (Object)null);
      this.a.addElement(new bk(this, new bj[]{var1}));
      this.a.addElement(this.b);
   }

   public final b a() {
      Integer var1 = new Integer(this.g);
      b var2;
      if ((var2 = (b)this.a.get(var1)) == null) {
         c var5 = null;
         String var3 = "/pet/battle/skills/" + this.g + ".anu";
         System.out.println(var3);

         try {
            var5 = c.a(var3, false, cc.a());
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         b var6 = new b(var5, this.h, this.i);
         this.a.put(var1, var6);
         var2 = var6;
      }

      var2.a(0);
      var2.c(-1);
      return var2;
   }

   static b a(bi var0, b var1) {
      return var0.a = var1;
   }

   static b a(bi var0) {
      return var0.a;
   }

   static gb a(bi var0, gb var1) {
      return var0.a = var1;
   }

   static gb a(bi var0) {
      return var0.a;
   }
}
