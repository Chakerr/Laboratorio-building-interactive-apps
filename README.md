# Laboratorio: Actividades Android e Interacción del Usuario

## Objetivo

Este proyecto tiene como objetivo aplicar los fundamentos de las actividades en Android para crear una aplicación interactiva que permita al usuario seleccionar categorías de mascotas y obtener una lista de razas correspondientes. Se busca demostrar el manejo de componentes de la interfaz de usuario, la lógica de negocio y la interacción entre actividades y vistas.

## Presentación

El desarrollo se basa en la presentación **"Building Interactive Apps"**, que guía la creación de una aplicación básica en Android Studio. Se extendió la funcionalidad original de la aplicación **Beer Adviser** para adaptarla a un nuevo contexto: la selección de categorías de mascotas y la visualización de razas.

## Desarrollo

### Aspectos Clave Trabajados

1. **Diseño de la Interfaz de Usuario:**
   - Uso de `Spinner` para la selección de categorías de mascotas.
   - Implementación de `Button` para ejecutar la acción de búsqueda.
   - Uso de `TextView` para mostrar la lista de razas correspondientes.
   - Diseño del layout en `activity_main.xml` utilizando `LinearLayout` con orientación vertical.

2. **Manejo de Recursos:**
   - Creación de un archivo `strings.xml` para almacenar los recursos de cadena, incluyendo las categorías de mascotas y las razas.
   - Uso de `string` para definir las categorías y razas de mascotas.
   - Referenciación de recursos en el layout mediante `@string`.

3. **Lógica de Negocio:**
   - Implementación de la clase `Mascotas` con el método `getBreeds(String category)`, que devuelve una lista de razas basadas en la categoría seleccionada.
   - Uso de `ArrayList<String>` para manejar las listas de razas.

4. **Conexión entre la Interfaz y la Lógica:**
   - En la actividad `Activity_main`, se implementó el método `onClickFindBreeds(View view)` para manejar el evento de clic del botón.
   - Conversión del valor seleccionado en el `Spinner` a un `String` mediante `String.valueOf()`.
   - Actualización dinámica del `TextView` con la lista de razas usando `setText()`.

5. **Extensión de la Aplicación:**
   - Se adaptó la aplicación original **Beer Adviser** para manejar categorías de mascotas y razas.
   - Se agregaron nuevas categorías como "Pastores" y "Pinscher", con sus respectivas razas.

### Ejemplo de Funcionamiento

- **Categoría: Pastores**
  - Razas: Pastor Catalán, Pastor Alemán, Komondor, Pastor Australiano.
  
- **Categoría: Pinscher**
  - Razas: Dobermann, Pinscher Alemán, Pinscher Miniatura, Schnauzer.

Al seleccionar una categoría en el `Spinner` y hacer clic en el botón, la aplicación muestra la lista de razas correspondientes en el `TextView`.

## Imagenes de funcionamiento
![1](/img/1.png)
## Conclusión

Este proyecto demostró la aplicación de los conceptos fundamentales de Android, incluyendo el diseño de interfaces de usuario, el manejo de recursos, la implementación de lógica de negocio y la interacción entre actividades y vistas. La extensión de la aplicación original a un nuevo contexto (mascotas y razas) permitió reforzar estos conceptos y aplicar buenas prácticas en el desarrollo de aplicaciones Android.

## Referencias

- **Head First Android Development** de Dawn Griffiths y David Griffiths, O’Reilly Media, Inc.
- Presentación de apoyo: **Building Interactive Apps**.

---

Este documento resume los aspectos técnicos clave trabajados en el proyecto, destacando el manejo de componentes de Android, la lógica de negocio y la interacción entre la interfaz y la actividad.
