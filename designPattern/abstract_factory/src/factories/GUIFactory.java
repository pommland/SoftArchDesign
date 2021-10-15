package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * EN: Abstract factory knows about all (abstract) product types.
 *
 * RU: Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
