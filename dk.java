import javax.microedition.lcdui.Image;

public final class dk extends da {
   public int a;
   public String a;
   public int b;
   private fl c;

   public dk(int var1, String var2, String var3, int var4) {
      super((Image)null);
      this.c = gj.b;
      this.b = au.a(var4);
      this.e = var2;
      this.a = var3;
      this.a = var1;
   }

   public dk(fl var1, int var2, String var3, String var4, int var5) {
      this(var2, var3, var4, var5);
      this.c = var1;
   }

   public final void a() {
      if (this.b != 0) {
         this.c.a(bc.a, this.e + " " + this.b + " (mp)", this.r + 2, this.s + 2, 20);
      } else {
         this.c.a(bc.a, this.e, this.r + 2, this.s + 2, 20);
      }
   }
}
