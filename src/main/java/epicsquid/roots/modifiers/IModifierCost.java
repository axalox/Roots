package epicsquid.roots.modifiers;

import epicsquid.roots.api.Herb;

import javax.annotation.Nullable;
import java.util.Locale;

public interface IModifierCost {
  CostType getCost();

  double getValue();

  @Nullable
  Herb getHerb();

  @Nullable
  default String asPropertyName () {
    Herb herb = getHerb();
    if (herb == null) {
      return null;
    }

    return herb.getName() + "_" + getCost().toString().toLowerCase(Locale.ROOT);
  }
}
