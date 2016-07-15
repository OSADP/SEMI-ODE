_all__ = ['Status',
          'Control',
          'VehicleData',
          'VehicleSituationData',
          'VehicleSituationDataAsnBase64',
          'IntersectionData',
          'IntersectionSituationData',
          'IntersectionSituationDataAsnBase64',
          'AdvisoryData',
          'AdvisorySituationData',
          'AdvisorySituationDataAsnBase64',
          'MAPData',
          'SPaTData',
          'AggregateData',
          'WeatherData',
          'OtherData',
          'Authorization']

Status = ("Status", "status")
Control = ("Control", "control")
VehicleData = ("VehicleData", "veh")
VehicleSituationData = ("VehicleSituationData", "vsd")
VehicleSituationDataAsnBase64 = ("VehicleSituationDataAsnBase64", "vsdasn64")
IntersectionData = ("IntersectionData", "int")
IntersectionSituationData = ("IntersectionSituationData", "isd")
IntersectionSituationDataAsnBase64 = ("IntersectionSituationDataAsnBase64", "isdasn64")
AdvisoryData = ("AdvisoryData", "adv")
AdvisorySituationData = ("AdvisorySituationData", "asd")
AdvisorySituationDataAsnBase64 = ("AdvisorySituationDataAsnBase64", "asdasn64")
MAPData = ("MAPData", "map")
SPaTData = ("SPaTData", "spat")
AggregateData = ("AggregateData", "agg")
WeatherData = ("WeatherData", "weather")
OtherData = ("OtherData", "other")
Authorization = ("Authorization", "auth")


def all_dataTypes():
    return [
        Status,
        Control,
        VehicleData,
        VehicleSituationData,
        VehicleSituationDataAsnBase64,
        IntersectionData,
        IntersectionSituationData,
        IntersectionSituationDataAsnBase64,
        AdvisoryData,
        AdvisorySituationData,
        AdvisorySituationDataAsnBase64,
        MAPData,
        SPaTData,
        AggregateData,
        WeatherData,
        OtherData,
        Authorization]