# 🎓 University Management System (Sistema Universitario)

Un sistema de consola interactivo desarrollado en **Java** para la gestión de personal académico, administrativo y estudiantes de la universidad, aplicando los pilares fundamentales de la **Programación Orientada a Objetos (POO)**.

---

### 🌟 Aspectos Técnicos Destacados (POO)

- **Herencia y Jerarquía de Clases:** 
  - Clase base `Persona`[cite: 3].
  - Clases derivadas `Estudiante`[cite: 2], `Docente`[cite: 9] y `Administrativo`[cite: 7].
  - Herencia multinivel con `DocenteInvestigador` (hereda de `Docente`)[cite: 1].
- **Polimorfismo y Sobrescritura (`@Override`):**
  - Cálculo dinámico de sueldos y bonificaciones según el rol (`calcularPago()`)[cite: 1, 2, 3, 7, 9].
  - Personalización de descripciones de objetos con `toString()`[cite: 1, 2, 3, 7, 9].
- **Tipos Enumerados (`enum`):**
  - Control rígido de roles (`RolPersona`)[cite: 5] y carreras/departamentos de la facultad (`Departamento`)[cite: 8].
- **Encapsulamiento y Sobrecarga de Constructores:**
  - Uso de constructores largos y cortos (`this(...)`) para valores por defecto[cite: 1, 2, 7, 9].

---

### 🛠️ Funcionalidades del Sistema

1. **Registro de Personal:** Ingreso guiado de Estudiantes, Docentes, Investigadores y Administrativos[cite: 4].
2. **Búsqueda y Filtros:** 
   - Búsqueda directa por número de cédula[cite: 4, 6].
   - Filtrado dinámico por rol académico[cite: 4, 6].
   - Filtrado por departamento/carrera de la Facultad[cite: 4, 6].
3. **Cálculos Financieros:**
   - Cálculo automático del total de la nómina de la universidad[cite: 4, 6].
   - Cálculo de sueldos con bonos por publicaciones científicas[cite: 1], posgrados[cite: 9] y horas extra[cite: 7].
4. **Evaluación Académica:** Verificación del estado académico del estudiante (Aprobado, Supletorio, Reprobado) según su promedio[cite: 2, 4].

---

### 💻 Tecnologías Utilizadas

- **Lenguaje:** Java (JDK 8+)
- **IDE recomendada:** Eclipse / IntelliJ IDEA / NetBeans
- **Paquete:** `ec.edu.uce.grupo1`

---

### 🚀 ¿Cómo ejecutar el proyecto?

1. Clona este repositorio o descarga los archivos fuente `.java`.
2. Importa el paquete `ec.edu.uce.grupo1` en tu entorno de desarrollo (IDE) preferido[cite: 1, 2, 3, 4, 5, 6, 7, 8, 9].
3. Ejecuta la clase `Principal.java` para iniciar el menú interactivo en consola[cite: 4].

---
*Proyecto desarrollado por Lenin Paredes — Universidad Central del Ecuador (UCE)* 🇪🇨
