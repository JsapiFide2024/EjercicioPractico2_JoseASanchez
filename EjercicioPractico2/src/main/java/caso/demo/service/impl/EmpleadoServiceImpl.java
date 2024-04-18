/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package caso.demo.service.impl;

import caso.demo.dao.EmpleadoDao;
import caso.demo.domain.Hotel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import caso.demo.dao.HotelDao;
import caso.demo.domain.Empleado;
import caso.demo.service.EmpleadoService;
import caso.demo.service.HotelService;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoDao empleadoDao;
    
    
    @Transactional(readOnly=true)
    @Override
    public List<Empleado> getEmpleados() {
        var lista=empleadoDao.findAll();
        return lista;
    }

     @Override
    @Transactional(readOnly = true)
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDao.findById(empleado.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Empleado empleado) {
        empleadoDao.delete(empleado);
    }
}
