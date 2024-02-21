public class fz extends fy {
   private int a;
   public int b;
   public fy[] a;
   public boolean l;
   public int c;
   public fy c;
   public boolean m;

   public fz(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0);
   }

   public fz(int var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4);
      this.b = 1;
      this.l = false;
      this.c = 1;
      this.m = false;
      this.a = var5;
      this.a = new fy[0];
   }

   public fz() {
      this(0, 0, 1, 1, 0);
   }

   public fz(int var1) {
      this(0, 0, 1, 1, var1);
   }

   public final void a(fy var1, boolean var2) {
      fy[] var3 = new fy[this.a.length + 1];
      System.arraycopy(this.a, 0, var3, 0, this.a.length);
      var3[var3.length - 1] = var1;
      this.a = var3;
      var1.b = this;
      if (this.c == null && var1.h) {
         this.c = var1;
      }

      if (var2) {
         this.h();
      }

   }

   public final void a(fy var1) {
      this.a(var1, false);
   }

   public final void b(fy var1) {
      if (var1 != null && this.a.length != 0) {
         if (var1 == this.c) {
            this.c = null;
         }

         fy[] var2 = new fy[this.a.length - 1];
         boolean var3 = false;

         for(int var4 = 0; var4 < var2.length; ++var4) {
            if (this.a[var4] == var1) {
               var3 = true;
            }

            var2[var4] = this.a[var3 ? var4 + 1 : var4];
         }

         if (var3 || var1 == this.a[this.a.length - 1]) {
            this.a = var2;
         }

         this.h();
      }
   }

   public final void m() {
      this.c = null;
      this.a = new fy[0];
   }

   public final void c(fy var1) {
      if (this.g) {
         if (var1.e && this.a.length > 1) {
            int var4 = this.c();
            if (this.l) {
               this.a(true, var4, 1);
            } else {
               this.l = true;
               this.a(true, var4, 1);
               this.l = false;
            }
         } else {
            boolean var3 = false;
            var1.e = var3;
         }

         var1.g = false;
      }

   }

   public final fy a(int var1) {
      return this.a.length != 0 && var1 >= 0 && var1 < this.a.length ? this.a[var1] : null;
   }

   public final void c(int var1) {
      this.a = var1;
      this.h();
   }

   public void h() {
      switch(this.a) {
      case 1:
         this.d();
      default:
         return;
      case 2:
         fz var1 = this;
         if (this.a.length != 0) {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5;
            int var6 = var5 = this.a.length;

            while(true) {
               --var6;
               if (var6 < 0) {
                  if (var1.b > 0) {
                     if (var1.m && var1.t > 0) {
                        var3 = (var1.t - (var1.y + var1.x << 1)) / var1.b;
                        var1.a.a = var1.b * var3 + (var1.b + 1) * var1.c;
                        var1.t = var1.a.a + 2 * var1.y;
                     }

                     var1.a.a = var1.b * var3 + (var1.b + 1) * var1.c;
                  } else {
                     var6 = var1.t - 2 * var1.y;
                     var1.b = Math.max(var6 / var3, 1);
                     var2 = (var6 - var3 * var1.b) / (var1.b + 1);
                  }

                  var6 = var5 / var1.b;
                  if (var5 % var1.b != 0) {
                     ++var6;
                  }

                  var1.a.b = var6 * var4 + (var6 - 1) * var1.c;

                  for(int var12 = 0; var12 < var5; ++var12) {
                     var6 = var12 % var1.b;
                     int var8 = var12 / var1.b;
                     int var9 = var6 * var3;
                     int var10 = var8 * var4;
                     var1.a(var12).a(var9 + (var6 + 1) * var2, var10 + var8 * var1.c, var3, var4);
                  }

                  if (var1.m) {
                     var1.t = var1.a.a + 2 * var1.y;
                     var1.u = var1.a.b + 2 * var1.y;
                  }
                  break;
               }

               fy var7 = var1.a(var6);
               var3 = Math.max(var3, var7.t);
               var4 = Math.max(var4, var7.u);
            }
         }

      }
   }

   protected void d() {
      this.a.b = 0;
      if (this.a.length != 0) {
         this.b = 1;
         int var1 = this.a.length;
         int var2 = 0;
         int var3;
         if (this.m) {
            for(var3 = 0; var3 < var1; ++var3) {
               if (var2 < this.a[var3].t) {
                  var2 = this.a[var3].t;
               }
            }

            this.t = this.a.a = var2 + (this.y + this.x << 1);
         } else if (this.t > 0) {
            var2 = this.t - (this.y + this.x << 1);
         }

         var3 = 0;

         for(int var4 = 0; var4 < var1; ++var4) {
            fy var5;
            (var5 = this.a(var4)).a(0, var3, var2, var5.u);
            if (var5 instanceof fz) {
               ((fz)var5).h();
            }

            var3 = var5.s + var5.u + this.c;
         }

         this.a.b = var3 - this.c;
         if (this.m) {
            fy var10000;
            if (this.b != null && this.b instanceof fz && ((fz)this.b).m) {
               var10000 = this.b;
               var10000.u -= this.u;
            }

            this.u = this.a.b + (this.y + this.x << 1);
            if (this.b != null && this.b instanceof fz && ((fz)this.b).m) {
               var10000 = this.b;
               var10000.u += this.u;
               return;
            }
         } else if (this.u == 0) {
            this.u = this.a.b + (this.y + this.x << 1);
         }

      }
   }

   public final int b() {
      return this.a == null ? 0 : this.a.length;
   }

   public final fy a(boolean var1) {
      while(this.a != null) {
         int var2 = this.a.length;

         fy var3;
         do {
            --var2;
            if (var2 < 0) {
               if (this.h) {
                  return this;
               }

               return null;
            }
         } while(!(var3 = this.a[var2]).e);

         if (!var1 || !(var3 instanceof fz)) {
            return var3;
         }

         fz var10000 = (fz)var3;
         var1 = true;
         this = var10000;
      }

      return this;
   }

   public final int c() {
      if (this.a != null) {
         int var1 = this.a.length;

         while(true) {
            --var1;
            if (var1 < 0) {
               break;
            }

            if (this.a[var1].e) {
               return var1;
            }
         }
      }

      return -1;
   }

   public void e() {
      super.e();
      if (this.a != null) {
         int var1 = this.a.length;

         while(true) {
            --var1;
            if (var1 < 0) {
               break;
            }

            if (this.a[var1].g) {
               this.a[var1].e();
            }
         }
      }

   }

   public void a() {
      bc.a.translate(-this.z, -this.A);
      if (this.a != null) {
         fy var1 = this.a(false);

         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (this.a[var2].g && var1 != this.a[var2] && !(this.a[var2] instanceof fp)) {
               this.a[var2].f();
            }
         }

         if (var1 != this && var1 != null && !(var1 instanceof fp)) {
            var1.f();
         }
      }

      bc.a.translate(this.z, this.A);
   }

   public final boolean a(boolean var1, int var2, int var3) {
      while(this.a != null && this.a.length != 0) {
         fz var4 = this;
         int var5 = 0;

         boolean var10000;
         while(true) {
            if (var5 >= var4.a.length) {
               var10000 = false;
               break;
            }

            if (var4.a[var5].h) {
               var10000 = true;
               break;
            }

            ++var5;
         }

         if (!var10000) {
            return false;
         }

         int var10001 = var1 ? var3 : -var3;
         int var9 = var2 + (var1 ? var3 : -var3);
         int var8 = var2 + var10001;
         if (var9 < 0) {
            if (this.l) {
               var8 = this.a.length - 1;
            } else {
               var8 = var2;
            }
         } else if (var8 >= this.a.length) {
            if (this.l) {
               var8 = 0;
            } else {
               var8 = var2;
            }
         }

         if (var2 == var8 || var2 > 0 && this.a[var2] == this.a[var8]) {
            return false;
         }

         fy var7;
         if ((var7 = this.a[var8]).g && var7.h) {
            if (var7 instanceof fz) {
               fy var6 = ((fz)var7).a();
               bc.a().a(var6);
            } else {
               bc.a().a(var7);
            }

            return true;
         }

         var2 = var8;
         var1 = var1;
         this = this;
      }

      return false;
   }

   public final fy a() {
      while(true) {
         if (this.c != null && this.c.g && this.c.h) {
            if (this.c instanceof fz) {
               this = (fz)this.c;
               continue;
            }

            return this.c;
         }

         return this;
      }
   }

   public boolean a(int var1, int var2) {
      boolean var3 = false;
      fy var4;
      if ((var4 = this.a(false)) != this && var4 != null && var4.a(var1, var2)) {
         return true;
      } else {
         if (var1 == 0 && var2 == -3 && this.a != 1) {
            var3 = this.a(false, this.c(), 1);
         } else if (var1 == 0 && var2 == -4 && this.a != 1) {
            var3 = this.a(true, this.c(), 1);
         } else if (var1 == 0 && var2 == -2) {
            var3 = this.a(true, this.c(), this.b);
         } else if (var1 == 0 && var2 == -1) {
            var3 = this.a(false, this.c(), this.b);
         }

         return var3;
      }
   }

   public boolean b(int var1, int var2) {
      fy var3;
      if ((var3 = this.a(var1, var2)) == this) {
         return super.b(var1, var2);
      } else {
         return var3 != null ? var3.b(var1, var2) : false;
      }
   }

   private fy a(int var1, int var2) {
      label30:
      while(true) {
         for(int var3 = this.a.length - 1; var3 >= 0; --var3) {
            fy var4;
            if ((var4 = this.a(var3)).g && var4.e(var1, var2)) {
               if (var4 instanceof fz) {
                  fz var10000 = (fz)var4;
                  var1 = var1;
                  this = var10000;
                  continue label30;
               }

               if (var4.h) {
                  return var4;
               }
            }
         }

         if (this.h && this.e(var1, var2)) {
            return this;
         }

         return null;
      }
   }

   public final boolean e() {
      return this.j;
   }

   public final boolean d() {
      return this.i;
   }

   public final void n() {
      int var1 = this.b();

      while(true) {
         --var1;
         if (var1 < 0) {
            this.c = null;
            return;
         }

         fy var2;
         (var2 = this.a(var1)).g = false;
         var2.e = false;
      }
   }

   public final void d(fy var1) {
      this.b(var1.r, var1.s, var1.t, var1.u);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      this.h();
   }

   public final int d() {
      return this.t - (this.y + this.x << 1);
   }

   public final boolean a(fy var1) {
      for(int var2 = this.a.length - 1; var2 >= 0; --var2) {
         if (this.a[var2] == var1) {
            return true;
         }
      }

      return false;
   }
}
