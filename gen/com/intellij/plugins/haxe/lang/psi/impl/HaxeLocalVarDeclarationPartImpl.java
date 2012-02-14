// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.haxe.lang.lexer.HaxeTokenTypes.*;
import com.intellij.plugins.haxe.lang.psi.*;

public class HaxeLocalVarDeclarationPartImpl extends HaxePsiCompositeElementImpl implements HaxeLocalVarDeclarationPart {

  public HaxeLocalVarDeclarationPartImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public HaxePropertyDeclaration getPropertyDeclaration() {
    return findChildByClass(HaxePropertyDeclaration.class);
  }

  @Override
  @Nullable
  public HaxeTypeTag getTypeTag() {
    return findChildByClass(HaxeTypeTag.class);
  }

  @Override
  @Nullable
  public HaxeVarInit getVarInit() {
    return findChildByClass(HaxeVarInit.class);
  }

}