public final class w extends fh implements go {
   private int d = 94;
   private int e = 126;
   private int f = 24;
   public static int a;
   private x a;
   private x b;
   private fn a;

   public w() {
      this.u = this.e;
      this.t = bc.h;
      this.v = this.r = bc.b - this.t >> 1;
      this.w = (bc.c - this.u >> 1) + 6;
      this.s = -this.u;
      a = 0;
      this.a = new fn(c.a(422));
      this.a = new x(this, (byte)0);
      this.a.a = 1;
      this.a.d = new gq(1, c.a(337), this);
      this.a.u = 60;
      this.a.t = 45;
      this.a.v = (this.t >> 1) - this.a.t >> 1;
      this.a.w = this.u + this.f - this.a.u >> 1;
      this.b = new x(this, (byte)0);
      this.b.a = 0;
      this.b.d = new gq(2, c.a(337), this);
      this.b.u = 60;
      this.b.t = 45;
      this.b.v = (this.t >> 1) + ((this.t >> 1) - this.b.t >> 1);
      this.b.w = this.u + this.f - this.b.u >> 1;
      this.a.x = this.b.x = 1;
      this.a.r = 0;
      this.b.r = this.d;
      this.c = this.a;
      this.c = new gq(3, c.a(139), this);
      ao var1 = new ao();
      this.a(this.a, false);
      this.a(var1, false);
      this.a(this.a, false);
      this.a(this.b, false);
      this.b = 2;
      this.c(0);
      this.a.a(0, 4, this.t, gg.m);
      this.a.q = 17;
      var1.a(0, this.a.u + this.a.s + gg.p, this.t, 4);
      this.e = new gq(4, c.a(267), this);
   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 1:
         a = 0;
         j.f(c.a(130) + ":");
         return;
      case 2:
         a = 1;
         j.f(c.a(130) + ":");
         return;
      case 3:
         j.g();
         return;
      case 4:
         eu.e();
      default:
      }
   }
}
