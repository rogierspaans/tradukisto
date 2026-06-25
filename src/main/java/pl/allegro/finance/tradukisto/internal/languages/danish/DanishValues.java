package pl.allegro.finance.tradukisto.internal.languages.danish;

import static pl.allegro.finance.tradukisto.internal.support.BaseNumbersBuilder.baseNumbersBuilder;
import static pl.allegro.finance.tradukisto.internal.support.MapSupport.unmodifiableEntry;
import static pl.allegro.finance.tradukisto.internal.support.MapSupport.unmodifiableMapOf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import pl.allegro.finance.tradukisto.internal.BaseValues;
import pl.allegro.finance.tradukisto.internal.languages.GenderForms;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;
import pl.allegro.finance.tradukisto.internal.languages.RegularPluralForms;

public class DanishValues implements BaseValues {

  @Override
  public Map<Integer, GenderForms> baseNumbers() {
    return baseNumbersBuilder()
      .put(0, "nul")
      .put(1, "en")
//      .put(1, genderForms("et", "en", "en", "en"))
      .put(2, "to")
      .put(3, "tre")
      .put(4, "fire")
      .put(5, "fem")
      .put(6, "seks")
      .put(7, "syv")
      .put(8, "otte")
      .put(9, "ni")
      .put(10, "ti")
      .put(11, "elleve")
      .put(12, "tolv")
      .put(13, "tretten")
      .put(14, "fjorten")
      .put(15, "femten")
      .put(16, "seksten")
      .put(17, "sytten")
      .put(18, "atten")
      .put(19, "nitten")
      .put(20, "tyve")
      .put(30, "tredive")
      .put(40, "fyrre")
      .put(50, "halvtreds")
      .put(60, "tres")
      .put(70, "halvfjerds")
      .put(80, "firs")
      .put(90, "halvfems")
      .put(100, "hundrede")
      .put(200, "to hundrede")
      .put(300, "tre hundrede")
      .put(400, "fire hundrede")
      .put(500, "fem hundrede")
      .put(600, "seks hundrede")
      .put(700, "syv hundrede")
      .put(800, "otte hundrede")
      .put(900, "ni hundrede")
      .build();
  }

  @Override
  public List<PluralForms> pluralForms() {
    return Arrays.asList(
      new RegularPluralForms("million", "millioner"),
      new RegularPluralForms("milliard", "milliarder"),
      new RegularPluralForms("billion", "billioner")
    );
  }

  @Override
  public String currency() {
    return "kr";
  }

  @Override
  public char twoDigitsNumberSeparator() {
    return '-';
  }


  public Map<Integer, String> exceptions() {
    return unmodifiableMapOf(
      unmodifiableEntry(1, "et"),
      unmodifiableEntry(21, "enogtyve"),
      unmodifiableEntry(100, "et hundrede")
    );
  }

}