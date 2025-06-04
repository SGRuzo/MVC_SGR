````mermaid
sequenceDiagram
    participant View
    participant Controller
    participant Model
    View->>Controller: crearCocheC(modelo, matricula)
    Activate View 
    Controller->>Model: crearCoche(modelo, matricula)
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller-->>View: Coche
    Deactivate View
    View->>View: mostrarCoche(coche)
````
`````mermaid

sequenceDiagram
    participant View
    participant Controller
    participant Model
    View->>Controller: mostrarVelocidadC(matricula)
    activate View
    Controller->>Model: getVelocidad(matricula)
    activate Model
    Model-->>Controller: velocidad
    deactivate Model
    Controller-->>View: velocidad
    deactivate View
    View->>View: System.out.println(velocidad)
`````
      
`````mermaid

sequenceDiagram
    participant View
    participant Controller
    participant Model
    participant Observer
    
    View->>Controller: ponerGasolinaC(matricula, litros)
    Controller->>Model: ponerGasolina(matricula, litros)
    Model->>Model: Actualiza gasolina del coche
    Model->>Observer: update(coche)
    alt gasolina < 10
    ObserverGasolina->>View: alarmaRepostar(matricula)
    end
    Model-->>Controller: true/false
    Controller-->>View: true/false
    View->>View: alarmaRepostar(String matricula)
`````