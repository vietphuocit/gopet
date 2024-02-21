import javax.microedition.lcdui.Image;

public class ff extends fn implements go {
   public int c;
   public boolean a;
   public int d;
   public int e;
   private int a;
   private int b;

   public ff() {
      this(0);
   }

   public ff(int var1) {
      this("");
      this.c = var1;
      if (var1 == 1 || var1 == 2) {
         this.d = new gq(0, gk.a(7), this);
      }

   }

   public ff(Image var1) {
      this(0);
      this.a((Image)var1);
   }

   public ff(String var1, fl var2) {
      super(var1, var2);
      this.c = 0;
      this.a = false;
      this.d = 16777215;
      this.e = 16777215;
      this.a = -1;
      this.b = -1;
      this.h = true;
   }

   public ff(String var1) {
      super(var1);
      this.c = 0;
      this.a = false;
      this.d = 16777215;
      this.e = 16777215;
      this.a = -1;
      this.b = -1;
      this.h = true;
   }

   private ff(gq var1, fl var2) {
      this(var1 == null ? "" : var1.a, var2);
      this.d = var1;
   }

   public ff(gq var1) {
      this(var1, gj.a);
   }

   public final void a(gq var1) {
      this.e = var1 == null ? "" : var1.a;
      this.d = var1;
   }

   public void c() {
      gg.a(this);
   }

   public void a() {
      super.a();
      gg.c(this);
   }

   protected void b() {
      gg.b(this);
   }

   public void a_() {
      super.a_();
      if ((this.c == 1 || this.c == 2) && this.a != null) {
         this.p = 1;
         this.x = 1;
      }

   }

   public final void g() {
      super.g();
      if ((this.c == 1 || this.c == 2) && this.a != null) {
         this.p = 0;
         this.x = 0;
      }

   }

   public final void a(Object var1) {
      if (this.c == 1) {
         this.a = !this.a;
      }

      if (this.c == 2 && !this.a) {
         ((fg)this.b).a(this);
      }

   }
}
