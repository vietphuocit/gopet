import java.util.Vector;

public final class fp extends fz implements go {
   public fy a;
   private fl a;
   private fl b;
   private int a;
   private Vector a;
   private int d;
   public boolean a;

   public fp() {
      this.a = gj.a;
      this.b = gj.a;
      this.a = Math.max(this.a.a(), this.b.a()) + 2 * gg.p;
      this.d = 0;
      this.a = false;
      this.y = 1;
      this.x = 3;
      this.e = new gq(0, gk.a(0), this);
      this.d = new gq(2, gk.a(7), this);
      this.l = true;
      this.j = true;
   }

   public final void a(Vector var1, int var2) {
      this.d = 0;
      this.k = false;
      if (this.a != null && this.a != var1) {
         this.a = true;
      }

      this.a = var1;
      int var3 = var1.size();
      this.a = Math.max(this.a.a(), this.b.a()) + 2 * gg.p;
      this.a.b = var3 * this.a;
      this.u = this.a.b + (this.x + this.y << 1) > bc.i ? bc.i : this.a.b + (this.x + this.y << 1);
      int var4 = var3;

      while(true) {
         --var4;
         if (var4 < 0) {
            if (this.a.a < bc.d) {
               this.a.a = bc.d;
            }

            this.t = this.a.a + 2 * (this.y + this.x);
            this.w = bc.c - gg.n - this.u - 1;
            this.s = bc.c - gg.n;
            if (var2 == 0) {
               this.v = this.r = 1;
               return;
            }

            if (var2 == 1) {
               this.v = this.r = bc.b - this.t;
               return;
            }

            this.v = this.r = bc.d - (this.t >> 1);
            return;
         }

         var3 = this.a.a(((gq)var1.elementAt(var4)).a);
         this.a.a = this.a.a > var3 ? this.a.a : var3;
      }
   }

   public final void a() {
      bc.a.translate(-this.z, -this.A);
      if (this.a != null && !this.a.isEmpty()) {
         int var1 = this.a.size();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (this.d == var2) {
               gf.a(bc.a, this.k ? gg.j : gg.b, this.k ? gg.i : gg.a, 0, var2 * this.a, this.t - (this.y + this.x << 1) - 1, this.a - 1, false);
            }

            this.a.a(bc.a, ((gq)this.a.elementAt(var2)).a, gg.p, var2 * this.a + gg.p, 20);
            if (this.d == var2) {
               bc.a.setColor(gg.d);
               bc.a.drawRect(0, var2 * this.a, this.t - (this.y + this.x << 1) - 1, this.a - 1);
            }
         }
      }

      bc.a.translate(this.z, this.A);
   }

   public final boolean b(int var1, int var2) {
      int var3 = this.a(var1, var2);
      this.d = var3 >= 0 ? var3 : this.d;
      this.k = var3 >= 0;
      return super.b(var1, var2);
   }

   public final boolean d(int var1, int var2) {
      if (super.d(var1, var2)) {
         this.k = false;
         return true;
      } else {
         return false;
      }
   }

   public final boolean c(int var1, int var2) {
      int var3 = this.a(var1, var2);
      if (this.d == var3) {
         this.d = var3;
         if (this.k && !this.f) {
            this.i();
            return true;
         }

         this.k = false;
      }

      return super.c(var1, var2);
   }

   private int a(int var1, int var2) {
      if (this.a != null && !this.a.isEmpty()) {
         int var3 = this.a.size();

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = var1 - this.r - this.y + this.z;
            int var6 = var2 - this.s - this.y + this.A;
            if (var5 > 0 && var5 < this.t && var6 > var4 * this.a && var6 < var4 * this.a + this.a) {
               return var4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public final boolean a(int var1, int var2) {
      if (var2 != -3 && var2 != -4) {
         if (var2 == -5) {
            if (var1 == 1) {
               this.i();
               this.k = false;
            } else {
               this.k = true;
            }

            return true;
         } else {
            boolean var3 = false;
            if (var2 == -2 && var1 == 0) {
               if (this.a != null && !this.a.isEmpty()) {
                  if (this.d < this.a.size() - 1) {
                     ++this.d;
                  } else {
                     this.d = 0;
                  }

                  var3 = true;
               }
            } else if (var2 == -1 && var1 == 0 && this.a != null && !this.a.isEmpty()) {
               if (this.d > 0) {
                  --this.d;
               } else {
                  this.d = this.a.size() - 1;
               }

               var3 = true;
            }

            if (var3) {
               this.b(0, this.d * this.a, this.t - (this.x + this.y << 1), this.a);
            }

            return var3;
         }
      } else {
         return true;
      }
   }

   protected final void b() {
      super.b();
      gg.a(this);
   }

   public final void c() {
      gg.b(this);
   }

   public static void k_() {
      bc.a().u();
   }

   private void i() {
      if (this.a != null && this.d >= 0 && this.d < this.a.size()) {
         if (!this.a) {
            bc.a().u();
         } else {
            this.a = false;
         }

         ((gq)this.a.elementAt(this.d)).a(new gq[]{(gq)this.a.elementAt(this.d)});
      }

   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 0:
         bc.a().u();
         return;
      case 2:
         this.i();
      default:
      }
   }
}
