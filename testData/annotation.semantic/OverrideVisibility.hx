class AA extends A {
  override public function a() {
  }
}

class A {
  public function a() {
  }
}

class BB extends B {
  override public function b() {
  }
}

class B {
  private function b() {
  }
}

class CC extends C {
  override private function <warning descr="Field c has less visibility (public/private) than superclass one.">c</warning>() {
  }
}

class C {
  public function c() {
  }
}