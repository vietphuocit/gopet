public class fy {
   public static gq b = new gq(-1, "", (go)null);
   public int r;
   public int s;
   public int t;
   public int u;
   public boolean e = false;
   public boolean f = false;
   public boolean g = true;
   public gq c;
   public gq d;
   public gq e;
   public int v;
   public int w;
   public int x = 0;
   public int y = 0;
   public boolean h = true;
   public fy b;
   private int a;
   private int b;
   public int z;
   public int A;
   private int c;
   public int B;
   private int d;
   private int e;
   private int f;
   private int g;
   public boolean i;
   public boolean j;
   public gl a;
   public boolean k;
   public go b;
   public int C = 3;
   public int D;
   public int E;
   private int h;
   private int i;
   private int j;
   private int k;
   private long a = 0L;
   private long b = 0L;

   public fy() {
      this.a = new gl();
   }

   public fy(int var1, int var2, int var3, int var4) {
      this.r = var1;
      this.s = var2;
      this.t = var3;
      this.u = var4;
      this.v = var1;
      this.w = var2;
      this.a = new gl(var3, var4);
   }

   public void a() {
   }

   public void c() {
   }

   public void f() {
      int var1 = bc.a.getClipWidth();
      int var2 = bc.a.getClipHeight();
      int var3 = bc.a.getClipX();
      int var4 = bc.a.getClipY();
      if (this.t <= 0 || this.u <= 0 || var3 + var1 >= this.r && var3 <= this.r + this.t && var4 + var2 >= this.s && var4 <= this.s + this.u) {
         bc.a.translate(this.r, this.s);
         if (this.t > 0 && this.u > 0) {
            bc.a.clipRect(0, 0, this.t, this.u);
         }

         this.c();
         int var5 = bc.a.getClipWidth();
         int var6 = bc.a.getClipHeight();
         int var7 = bc.a.getClipX();
         int var8 = bc.a.getClipY();
         int var9 = this.y + this.x;
         bc.a.clipRect(var9, var9, this.t - (var9 << 1), this.u - (var9 << 1));
         bc.a.translate(var9, var9);
         this.a();
         bc.a.translate(-var9, -var9);
         bc.a.setClip(var7, var8, var5, var6);
         this.b();
         bc.a.translate(-this.r, -this.s);
         bc.a.setClip(var3, var4, var1, var2);
      }
   }

   public void e() {
      if (this.w != this.s) {
         this.i = this.w - this.s << this.C;
         this.h += this.i;
         this.s += this.h >> 4;
         this.h &= 15;
      }

      if (this.v != this.r) {
         this.k = this.v - this.r << this.C;
         this.j += this.k;
         this.r += this.j >> 4;
         this.j &= 15;
      }

      if (this.c()) {
         if (this.A != this.B) {
            this.d = this.B - this.A << 2;
            this.e += this.d;
            this.A += this.e >> 4;
            this.e &= 15;
            this.i();
         }

         if (this.z != this.c) {
            this.f = this.c - this.z << 2;
            this.g += this.f;
            this.z += this.g >> 4;
            this.g &= 15;
         }
      }

   }

   public boolean a(int var1, int var2) {
      if (var2 == -5) {
         if (var1 == 1) {
            this.k = false;
            if (this.d != null) {
               this.d.a(new Object[]{this.d, this});
               return true;
            }
         } else {
            this.k = true;
         }
      } else if (var1 == 1 && var2 == -6) {
         if (this.c != null) {
            this.c.a(new Object[]{this.c, this});
            return true;
         }
      } else if (var1 == 1 && var2 == -7 && this.e != null) {
         this.e.a(new Object[]{this.e, this});
         return true;
      }

      return false;
   }

   public boolean b(int var1, int var2) {
      this.a = System.currentTimeMillis();
      this.b = (long)var2;
      this.h();
      this.k = true;
      if (this.h) {
         bc.a().a(this);
      }

      return true;
   }

   public boolean c(int var1, int var2) {
      if (this.f) {
         this.k = false;
         this.f = false;
         int var3 = var1;
         boolean var5 = this.d();
         boolean var11 = this.e();
         if (!(var5 && var11 ? Math.abs(bc.a.j - var3) > Math.abs(bc.a.k - var2) : var5)) {
            var1 = (int)((long)var2 - this.b);
            long var12;
            if ((var12 = System.currentTimeMillis() - this.a + 1L) != 1L) {
               long var9 = (long)((var1 = (int)((long)(var2 = (int)((long)(var1 << 11) / (var12 * var12))) * var12)) / ((var2 << 1) + 1));
               var1 = (int)((long)var1 * var9 - ((long)var2 * var9 * var9 >> 1) >> 8);
            } else {
               var1 = (int)(((long)var2 - this.b + 1L) * 250L / Math.abs((long)var2 - this.b + 1L));
            }

            if (this.A < 0) {
               this.B = 0;
               return true;
            }

            var2 = this.u - (this.y + this.x << 1);
            if (this.A > this.a.b - var2) {
               this.B = this.a.b - var2;
            } else {
               this.B -= var1;
            }

            if (this.B > this.a.b - var2) {
               this.B = this.a.b - var2;
            } else if (this.B < 0) {
               this.B = 0;
            }

            return true;
         }

         if (this.z < 0) {
            this.c = 0;
            return true;
         }

         var1 = this.t - 2 * this.y;
         if (this.z > this.a.a - var1) {
            this.c = this.a.a - var1;
            if (this.c < 0) {
               this.c = 0;
            }

            return true;
         }
      } else {
         if (this.k) {
            this.k = false;
            if (this.d != null) {
               this.d.a(new Object[]{this.d, this});
               return true;
            }
         }

         this.k = false;
      }

      return false;
   }

   public final boolean b() {
      return this.k;
   }

   public boolean d(int var1, int var2) {
      if (this.c()) {
         long var3;
         if ((var3 = System.currentTimeMillis()) - this.a > 500L) {
            this.a = var3;
            this.b = (long)var2;
         }

         if (!this.f) {
            this.a = var2;
            this.b = var1;
            this.f = true;
            bc.a().a = this;
            return true;
         } else {
            int var5;
            if (this.e()) {
               var5 = this.A + (this.a - var2);
               this.B = this.A = var5;
               this.i();
            }

            if (this.d()) {
               var5 = this.z + (this.b - var1);
               this.c = this.z = var5;
            }

            this.a = var2;
            this.b = var1;
            return true;
         }
      } else {
         if (this.b != null) {
            this.k = false;
            this.b.d(var1, var2);
         }

         return false;
      }
   }

   public final void b(boolean var1) {
      this.e = var1;
   }

   public final void c(boolean var1) {
      while(true) {
         this.e = var1;
         if (this.b == null || !this.b.h) {
            return;
         }

         this = this.b;
      }
   }

   public void a_() {
      if (this.b != null) {
         this.b.a(new Object[]{null, this});
      }

   }

   public final boolean e(int var1, int var2) {
      int var3 = this.a() + this.z;
      int var4 = this.b() + this.A;
      return var1 >= var3 && var1 < var3 + this.t && var2 >= var4 && var2 < var4 + this.u;
   }

   private int a() {
      int var1 = this.r - this.z + this.x + this.y;
      if (this.b != null) {
         var1 += this.b.a();
      }

      return var1;
   }

   private int b() {
      int var1 = this.s - this.A + this.x + this.y;
      if (this.b != null) {
         var1 += this.b.b();
      }

      return var1;
   }

   public void g() {
   }

   private void h() {
      while(true) {
         this.f = false;
         if (this.b == null) {
            return;
         }

         this = this.b;
      }
   }

   public final boolean c() {
      return this.d() || this.e();
   }

   public boolean d() {
      return this.i;
   }

   public boolean e() {
      return this.j;
   }

   public final gq a() {
      while(this.c == null) {
         if (this.b == null) {
            return null;
         }

         this = this.b;
      }

      return this.c;
   }

   public final gq b() {
      while(this.e == null) {
         if (this.b == null) {
            return null;
         }

         this = this.b;
      }

      return this.e;
   }

   public final gq c() {
      while(this.d == null) {
         if (this.b == null) {
            return null;
         }

         this = this.b;
      }

      return this.d;
   }

   public final void b(int var1, int var2, int var3, int var4) {
      int var5;
      if (this.e()) {
         var5 = this.u - (this.y + this.x << 1);
         if (var2 < this.B) {
            this.B = var2;
         } else if (var2 + var4 > this.B + var5) {
            this.B = var2 + var4 - var5;
            if (this.B >= this.a.b - var5) {
               this.B = this.a.b - var5;
            }
         }

         if (this.B < 0) {
            this.B = 0;
         }
      }

      if (this.d()) {
         var5 = this.t - (this.y + this.x << 1);
         if (var1 < this.c) {
            this.c = var1;
         } else if (var1 + var3 > this.c + var5) {
            this.c = var1 + var3 - var5;
            if (this.c > this.a.a - var5) {
               this.c = this.a.a - var5;
            }
         }

         if (this.c < 0) {
            this.c = 0;
         }
      }

   }

   public final void l() {
      bc.a().a(this);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.t = var3;
      this.u = var4;
      this.b(var1, var2);
   }

   public final void b(int var1, int var2) {
      this.r = var1;
      this.s = var2;
      this.v = var1;
      this.w = var2;
   }

   public final void c(int var1, int var2) {
      this.t = var1;
      this.u = var2;
   }

   private void i() {
      if (this.a.b != 0) {
         this.E = this.A * (this.u - (this.x << 1)) / this.a.b + this.x;
         this.D = (this.u - (this.x << 1)) * (this.u - (this.x << 1)) / this.a.b;
      }
   }

   protected void b() {
      gg.a(this);
   }

   public final void d(int var1, int var2) {
      this.a = new gl(var1, var2);
   }
}
