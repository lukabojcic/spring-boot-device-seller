package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Device;

import java.util.List;

public interface DeviceService {
    Device saveDevice(Device device);

    List<Device> finalAllDevices();

    void deleteDevice(Long deviceId);
}
