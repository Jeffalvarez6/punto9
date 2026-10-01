┌────────────────────────────────────────────────────────────────────────────────┐
│                           AsignacionRestaurante                                │
├────────────────────────────────────────────────────────────────────────────────┤
├────────────────────────────────────────────────────────────────────────────────┤
│ + asignarPrimeraDisponible(mesas: Mesa[], colaReservaciones: Cola): void {static}│
│ + asignarOptimizado(mesas: Mesa[], colaReservaciones: Cola): void {static}       │
└──────────────────┬─────────────────────────────────┬───────────────────────────┘
                   │                                 │
     contiene (nested class)           contiene (nested class)
                   │                                 │
                   ▼                                 ▼
┌───────────────────────────────────┐ ┌───────────────────────────────────┐
│ AsignacionRestaurante.Mesa        │ │ AsignacionRestaurante.Reservacion │
├───────────────────────────────────┤ ├───────────────────────────────────┤
│ ~ codigo: String                  │ │ ~ cliente: String                 │
│ ~ capacidad: int                  │ │ ~ comensales: int                 │
│ ~ ocupada: boolean                │ ├───────────────────────────────────┤
├───────────────────────────────────┤ │ + Reservacion(cliente, comensales)│
│ + Mesa(codigo, capacidad)         │ └─────────────────┬─────────────────┘
└───────────────────────────────────┘                   │
                                                        │ depende de (usa)
                                                        ▼
                                            ┌───────────────────────────┐
                                            │           Cola            │
                                            ├───────────────────────────┤
                                            │ # inicio: Nodo            │
                                            │ # fin: Nodo               │
                                            │ # nDatos: int             │
                                            ├───────────────────────────┤
                                            │ + estaVacia(): boolean    │
                                            │ + agregar(elem: Object)   │
                                            │ + eliminar(): void        │
                                            │ + tomar(): Object         │
                                            └───────────────────────────┘
